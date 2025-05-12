import java.util.Scanner;

public class PrintDivisorOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số N: ");
        int n = sc.nextInt();
        System.out.print("Ước của "+n+" là: ");
//        for (int i = 1; i <= n; i++) {
//
//            if (n % i == 0) {
//                System.out.print(i + " ");
//
//            }
//        }
        int i=1;
        while (i<=n) {
            if(n%i==0){
                System.out.print(i+" ");
            }
            i++;
        }
    }
}
