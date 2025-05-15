import java.util.Scanner;

public class SumOfNumbersInAColumn {
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
        System.out.print("Bạn muốn tính tổng của cột thứ mấy? ");
        int total_cols = sc.nextInt();
        int total = 0;
        String displayTotal = "";
        for (int i = 0; i < arr.length; i++) {
            total += arr[i][total_cols-1];
            displayTotal += arr[i][total_cols-1];
            if(i<arr.length-1){

                displayTotal += " + ";
            }
        }
        System.out.println("Tổng các phần tử của cột "+total_cols+" là: "+displayTotal+" = "+total);
    }
}
