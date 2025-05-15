import java.util.Arrays;
import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập kích thước ma trận vuông n x n. Nhập n = ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("arr[%d][%d] = ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều vừa nhập vào là");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        // Tính tổng đường chéo chính
        int sum = 0;
        String mainDiagonal = "";
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
            mainDiagonal += arr[i][i];
            if (i < n - 1) {
                mainDiagonal += " + ";
            }
        }

        // In kết quả
        System.out.println("\nTổng các phần tử đường chéo chính là: " +mainDiagonal+" = " + sum);
    }
}
