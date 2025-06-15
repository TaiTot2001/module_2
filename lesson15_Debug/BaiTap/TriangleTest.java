package BaiTap;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Nhập vào cạnh thứ nhất: ");
            int side1 = input.nextInt();
            System.out.print("Nhập vào cạnh thứ hai: ");
            int side2 = input.nextInt();
            System.out.print("Nhập vào cạnh thứ ba: ");
            int side3 = input.nextInt();
            CheckTriangle(side1, side2, side3);
            System.out.println("Đây là một tam giác hợp lệ");
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi! : " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Lỗi cú pháp! : " + e.getMessage());
        }
    }

    public static void CheckTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Cạnh không được nhỏ hơn hoặc bằng 0.");
        } else if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh không được nhỏ hơn hoặc bằng cạnh còn lại.");
        }

    }
}
