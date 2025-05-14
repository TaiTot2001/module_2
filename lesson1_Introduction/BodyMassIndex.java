import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cân nặng của bạn: ");
        double weight = sc.nextDouble();
        System.out.print("Nhập vào chiều cao của bạn: ");
        double height = sc.nextDouble();
        double BMI = weight / Math.pow(height, 2);
        System.out.printf("%-25s%s", "BMI","Interpretation\n");
        if (BMI < 18) {
            System.out.printf("%-25.2f%s", BMI, " Underweight");
        }
        else if (BMI <= 25.0) {
            System.out.printf("%-25.2f%s", BMI, " Normal");
        }
        else if (BMI <= 30.0) {
            System.out.printf("%-25.2f%s",BMI, " Overweight");
        }
        else {
            System.out.printf("%-25.2f%s", BMI, " Obese");
        }

    }
}
