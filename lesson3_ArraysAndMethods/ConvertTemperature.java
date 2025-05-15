import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("-------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Nhập vào lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhập vào nhiệt độ F:  ");
                    fahrenheit = sc.nextDouble();
                    System.out.println(fahrenheit + "F = " + fahrenheitToCelsius(fahrenheit) + "C\n\n\n");
                    break;
                case 2:
                    System.out.print("Nhập vào nhiệt độ C: ");
                    celsius = sc.nextDouble();
                    System.out.println(celsius + "C = " + celsiusToFahrenheit(celsius) + "F");
                    break;
                case 0:
                    System.out.println("Thoát chương trình !!");
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);

    }
}
