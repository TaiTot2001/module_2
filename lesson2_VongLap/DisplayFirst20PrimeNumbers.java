import java.util.Scanner;

public class DisplayFirst20PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bạn muốn hiển thị bao nhiêu số nguyên tố đầu tiên:");
        int numbers = scanner.nextInt();
        int count = 0;

        for (int N = 2; N < 999999; N++) {
            int check = 0;
            for (int j = 1; j <= N; j++) {
                if (N % j == 0) {
                    check++;
                }
            }
            if (check == 2) {
                System.out.println(N);
                count++;
            }
            if (count == numbers) {
                return;
            }
        }

    }
}
