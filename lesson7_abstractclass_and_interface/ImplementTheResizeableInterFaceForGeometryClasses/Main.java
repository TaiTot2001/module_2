package ImplementTheResizeableInterFaceForGeometryClasses;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4);
        shapes[1] = new Rectangle(5, 6);
        shapes[2] = new Square(7);

        Random random = new Random();

        for (Shape shape : shapes) {
            System.out.println("Before resize: ");
            System.out.println(shape);
            double areaBefore = 0;
            if (shape instanceof Circle) {
                areaBefore = ((Circle) shape).getArea();
            } else if (shape instanceof Rectangle) {
                areaBefore = ((Rectangle) shape).getArea();
            } else if (shape instanceof Square) {
                areaBefore = ((Square) shape).getArea();
            }
            System.out.printf("Area before: %.2f%n", areaBefore);
            double percent = random.nextInt(100)+1;
            System.out.printf("Resizing with: %.2f%%%n",percent);
            if(shape instanceof Resizeable){
                ((Resizeable) shape).resize(percent);
            }
            double areaAfter = 0;
            if (shape instanceof Circle) {
                areaAfter = ((Circle) shape).getArea();
            }
            else if (shape instanceof Rectangle) {
                areaAfter = ((Rectangle) shape).getArea();
            }

            System.out.println("After resize:");
            System.out.println(shape);
            System.out.printf("After resize: %.2f%n" ,areaAfter);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
