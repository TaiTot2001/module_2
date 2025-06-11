import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Giải phương trình bậc nhất a * x + b = 0  ");
        System.out.print("Nhập vào giá trị của a: ");
        int a = input.nextInt();
        System.out.print("Nhập vào giá trị của b: ");
        int b = input.nextInt();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm !");
            } else {
                System.out.println("Phương trình vô nghiệm !");
            }
        } else {
            System.out.println("Phương trình có nghiệm x = " + (-b / a));
        }
    }
}
