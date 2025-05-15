import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("arr = [10, 4, 6, 7, 8, 6, 0, 0, 0, 0]");
        System.out.print("Nhập vào phần tử mà bạn muốn xóa khỏi mảng: ");
        int input_Number = sc.nextInt();
        int[] result = removeElement(arr, input_Number);
        System.out.print("Mảng sau khi xóa là: arr = "+ Arrays.toString(result));
    }

    public static int[] removeElement(int[] arr, int Number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Number) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j +1];
                }
                arr[arr.length - 1] = 0;
                break;
            }
        }
        return arr;
    }
}
