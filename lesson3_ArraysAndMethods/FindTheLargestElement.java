import java.util.Scanner;

public class FindTheLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập vào kích thước để khởi tạo mảng 2 chiều: ");
        System.out.print("Nhập số hàng: ");
        int rows = sc.nextInt();
        System.out.print("Nhập số cột: ");  // có dấu cách để đẹp
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập vào giá trị thứ "+j+" của hàng " +i+": " );
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Mảng 2 chiều vừa nhập là:");
        for (int i = 0; i < rows; i++) {
            System.out.print("                           ");
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Giá trị lớn nhất trong mảng là: "+findTheLargestElement(arr));

    }
    public static String findTheLargestElement(int[][] arr) {
        int max = arr[0][0];
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        return "Giá trị lớn nhất trong mảng là: " + max + " tại vị trí [hàng = " + (maxRow +1) + ", cột = " + (maxCol+1) + "]";
    }
}
