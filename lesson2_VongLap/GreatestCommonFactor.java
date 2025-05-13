import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị a:");
        int a = sc.nextInt();
        System.out.println("Nhập vào giá trị b:");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a==0||b==0){
            System.out.println("Không có UCLN:");
        }
        while (a != b) {
            if (a > b) {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println("UCLN của "+a+ " và "+b+" là: "+a );
    }
}
