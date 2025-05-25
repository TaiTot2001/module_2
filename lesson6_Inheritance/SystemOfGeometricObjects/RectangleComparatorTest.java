package SystemOfGeometricObjects;

import java.util.Arrays;
import java.util.Comparator;

public class RectangleComparatorTest {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0]= new Rectangle(3,4);
        rectangles[1]= new Rectangle();
        rectangles[2]= new Rectangle(2,3, "indigo",false);
        System.out.println("Pre-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        Comparator<Rectangle> comparator = new RectangleComparator();
        Arrays.sort(rectangles, comparator);
        System.out.println("After-sorted:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
