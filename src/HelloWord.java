import java.util.Scanner;
public class HelloWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tuổi của bạn: ");
        int age = sc.nextInt();
        sc.nextLine(); // Phải có sau khi lấy số từ bàn phím
        System.out.println("Nhập vào tên của bạn: ");
        String name = sc.nextLine();
        System.out.println("Tuoi cua ban la: " + age);
        System.out.println("Tên của bạn là: " + name);
    }
}
