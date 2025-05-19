public class Circle {
    private double radius =1.0;
    private String color = "red";
    public static int numberOfCircle = 1;
    public Circle() {}
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
        numberOfCircle++;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }
    void display() {
        System.out.println("Hinh tròn "+numberOfCircle);
        System.out.println("Bán kính  hình tròn là: "+ getRadius());
        System.out.println("Diện tích hình tròn là: "+ getArea());
        System.out.println("Màu: "+ getColor());
    }
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.display();
        Circle circle2 = new Circle(3.0,"blue");
        circle2.display();
    }

}
