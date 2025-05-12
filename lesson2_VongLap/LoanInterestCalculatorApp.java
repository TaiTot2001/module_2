import java.util.Scanner;

public class LoanInterestCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Số lượng tiền cho vay: ");
        int money = sc.nextInt();
        System.out.println("Tỉ lệ lãi suất theo tháng: ");
        double interestRate = sc.nextDouble();
        System.out.println("Số tháng cho vay: ");
        int month = sc.nextInt();
        double total =0;
        for (int i = 0; i < month; i++) {
            total += money * (interestRate/100)/12 * month ;
        }
        System.out.printf("Số tiền lãi cho vay là:  %.2f", total);
    }
}
