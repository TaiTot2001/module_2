package IllegalTriangle;

import java.util.Scanner;

public class TriangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double c = scanner.nextDouble();

            checkTriangle(a, b, c);
            System.out.println("Đây là một tam giác hợp lệ.");

        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi nhập dữ liệu: " + e.getMessage());
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh không được nhỏ hơn hoặc bằng 0.");
        }
        if ((a + b) <= c || (a + c) <= b || (b + c) <= a) {
            throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn cạnh còn lại.");
        }
    }
}
