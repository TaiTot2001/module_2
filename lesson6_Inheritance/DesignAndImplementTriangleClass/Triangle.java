package DesignAndImplementTriangleClass;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    ;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1=" + side1 + ", side2=" + side2 + ", side3=" + side3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh thứ nhất của tam giác: ");
        double side1 = sc.nextDouble();
        System.out.println("Nhập vào cạnh thứ hai của tam giác: ");
        double side2 = sc.nextDouble();
        System.out.println("Nhập vào cạnh thứ ba của tam giác:");
        double side3 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhập vào màu của tam giác");
        String color = sc.nextLine();


        Triangle triangle = new Triangle(side1, side2, side3,color, true);
        System.out.println("Thông tin tam giác: ");
        System.out.println(triangle);
        System.out.println("Màu: "+ color);
        System.out.println("Diện tích hình tam giác là: "+triangle.getArea());
        System.out.println("Chu vi hình tam giác là: "+triangle.getPerimeter());
        System.out.println("Có được tô màu không : " + triangle.isFilled());



    }
}
