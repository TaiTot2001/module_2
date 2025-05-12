
import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất a*x + b = c");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("a : ");
        a = sc.nextDouble();
        System.out.println("b : ");
        b = sc.nextDouble();
        System.out.println("c : ");
        c = sc.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("x = %.2f!", answer);
        }
        else {
            if (b==c){
                System.out.print("Phương trình có vô số nghiệm !");
            }
            else {
                System.out.print("Phương trình vô nghiệm !");
            }
        }
    }
}
