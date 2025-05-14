import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ứng dụng chuyển đổi tiền tệ từ  USD --> VND");
        System.out.print("Nhập vào số tiền USD mà bạn muốn đổi: ");
        double USD = sc.nextDouble();
        double VND = USD * 23000;
        System.out.printf("%-25s%s","USD","VND\n");
        System.out.printf("%-25.2f%.2f\n",USD,VND);
    }
}
