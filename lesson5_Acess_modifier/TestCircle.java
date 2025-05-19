public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(3.0,"blue");
        System.out.println("Hinh tròn 1");
        System.out.println("Bán kính  hình tròn là: "+ circle.getRadius());
        System.out.println("Diện tích hình tròn là: "+ circle.getArea());
        System.out.println("Màu: "+ circle.getColor());
        System.out.println( " Hình tròn 2");
        System.out.println("Bán kính  hình tròn là: "+circle2.getRadius());
        System.out.println("Diện tích hình tròn là:"+circle2.getArea());
        System.out.println("Màu: "+ circle2.getColor());

    }
}
