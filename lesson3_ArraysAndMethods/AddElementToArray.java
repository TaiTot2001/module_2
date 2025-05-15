import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhập vào số phần tử bạn muốn khởi tao mảng array: ");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Mảng chỉ được khởi tạo tối đa 10 phần tử !");
                System.out.println("--------------------------+----------------------------");
            }
        } while (size > 10);
        array = new int[size];
        System.out.print("Bạn muốn nhập mấy phần tử vào mảng? ");
        int input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            System.out.print("Nhập vào giá trị tại index = " + i + " :");
            array[i] = sc.nextInt();
        }
        int index;
        int input_Number;
        System.out.print("\nNhập vào giá trị bạn muốn thêm: ");
        input_Number = sc.nextInt();
        do {
            System.out.print("Bạn muốn thêm " + input_Number + " tại vị trí có index = ");
            index = sc.nextInt();
            if (index < 0 || index >= array.length - 1) {
                System.out.print("Vị trí index = " + index + " không tồn tại trong mảng !!\n");
            }
        } while (index < 0 || index >= array.length);
        System.out.printf("\n%-30s%s", "Mảng vừa nhập vào là: ", "");
        System.out.printf("array = " + Arrays.toString(array));
        for (int i = input; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = input_Number;

        System.out.printf("\n%-30s%s", "Mảng mới sau khi thêm :", "");
        System.out.printf("array = " + Arrays.toString(array));
    }
}
