import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Tạo một mảng với size là: ");
            size = sc.nextInt();
            if(size >20){
                System.out.println("Chương trình chỉ nhận size < 20");
            }
        }while(size > 20);
        array = new int[size];
        int i=0;
        while (i < size) {
            System.out.print("Nhập vào phần tử có vị trí tại index_"+ (i + 1)+" = ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("\n%-40s%s","Mảng bạn vừa nhập vào là:","");
        int j;
        for (j=0;j < array.length;j++) {
            System.out.print(array[j]+"\t");
        }
        System.out.printf("\n%-40s%s","Mảng sau khi đảo ngược vị trí:","");
        for (j=0;j < array.length/2;j++) {
            int temp = array[j];
            array[j] = array[array.length-1-j];
            array[array.length-1-j] = temp;
        }
        for (j=0;j < array.length;j++) {
            System.out.print(array[j]+"\t");
        }
        System.out.println("\n\n");
    }
}
