
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        QuadraticEquation quadraticEquation = new QuadraticEquation(1, 4, 4);
//        System.out.println("delta = "+quadraticEquation.getDiscriminant());
//        System.out.println("Nghiệm 1:" +   quadraticEquation.getRoot1());
//        System.out.println("Nghiệm 2:" +   quadraticEquation.getRoot2());
//        quadraticEquation.setB(-4);
//        System.out.println(quadraticEquation.getB());
//        System.out.println("delta = "+quadraticEquation.getDiscriminant());
//        System.out.println("Nghiệm 1:" +   quadraticEquation.getRoot1());
//        System.out.println("Nghiệm 2:" +   quadraticEquation.getRoot2());






//        System.out.println("Giải phương trình bậc 2: ax² + bx + c = 0 ");
//        System.out.print("Nhập vào giá trị của a = ");
//        double a = sc.nextDouble();
//        System.out.print("Nhập vào giá trị của b = ");
//        double b = sc.nextDouble();
//        System.out.print("Nhập vào giá trị của c = ");
//        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-4,6);

        System.out.println("Giá trị delta: Δ = b² - 4ac = " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.hasTwoRoots()) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:  \nx1 = " + quadraticEquation.getRoot1() + "        x2 = " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.hasOneRoot()) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + quadraticEquation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        if (hasTwoRoots() || hasOneRoot()) {
            return (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
        return Double.NaN;
    }

    public double getRoot2() {
        if (hasTwoRoots()) {
            return (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
        }
        return Double.NaN;
    }

    public boolean hasTwoRoots() {
        return getDiscriminant() > 0;
    }

    public boolean hasOneRoot() {
        return getDiscriminant() == 0;
    }
}
