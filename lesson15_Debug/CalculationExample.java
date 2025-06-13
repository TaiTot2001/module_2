import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào giá trị của x: ");
        int numberOne = sc.nextInt();
        System.out.print("Nhập vào giá trị của y: ");
        int numberTwo = sc.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculation(numberOne, numberTwo);

    }

    public void calculation(int numberOne, int numberTwo) {
        try {
            int addition = numberOne + numberTwo;
            int subtract = numberOne - numberTwo;
            int multiply = numberOne * numberTwo;
            int divide = numberOne / numberTwo;
            System.out.println("Kết quả của x + y = " + addition);
            System.out.println("Kết quả của x - y = " + subtract);
            System.out.println("Kết quả của x * y = " + multiply);
            System.out.println("Kết quả của x / y = " + divide);
        } catch (ArithmeticException e) {
            System.out.println("Giá trị của y là khác 0 !" + e.getMessage());
        }
    }
}
