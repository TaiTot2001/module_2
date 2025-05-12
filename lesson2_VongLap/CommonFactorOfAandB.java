import java.util.Scanner;

public class CommonFactorOfAandB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tìm ước chung của a và b (Điều kiện a > b)");
        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();
//        sc.nextLine();
        System.out.println("Nhập vào số b: ");
        int b = sc.nextInt();
        System.out.println("ước chung của a và b: ");
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(i+" ");
            }
        }
    }
}
