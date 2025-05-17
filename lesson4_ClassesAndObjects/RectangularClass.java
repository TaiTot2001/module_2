import java.util.Scanner;

public class RectangularClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài của HCN: ");
        double chieuDai = sc.nextInt();
        System.out.print("Nhập vào chiều rộng của HCN: ");
        double chieuRong = sc.nextInt();
        Rectangle rectangle1 = new Rectangle();
        rectangle1.chuVi();
        Rectangle rectangle = new Rectangle(chieuDai, chieuRong);
        System.out.print("HCN sau khi nhập: " + rectangle.hienThi());
        System.out.println("\nDiện tích HCN là: " + rectangle.dienTich());
        System.out.println("Chu vi HCN là: " + rectangle.chuVi());


    }
}

class Rectangle {
    double chieuDai, chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double dienTich() {
        return chieuDai * chieuRong;
    }

    public double chuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public String hienThi() {
        return "HCN { Chiều Dài =" + chieuDai + " Chiều Rộng = " + chieuRong + " }";
    }

}