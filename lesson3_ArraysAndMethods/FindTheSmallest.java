import java.util.Arrays;
import java.util.Scanner;

public class FindTheSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Size;
        int[] arr;
        System.out.print("Khai báo mảng số nguyên với SIZE phần tử là : ");
        Size = sc.nextInt();
        arr = new int[Size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập giá trị cho phần tử có index = " + i + "trong mảng từ bàn phím: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập vào là:   array = " + Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là : " + min);
    }
}
