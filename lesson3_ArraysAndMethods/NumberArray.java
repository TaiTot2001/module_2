import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        int size;
        do{
            System.out.print("Nhập vào số lượng tỷ phú mà bạn muốn: ");
            size = sc.nextInt();
            if(size>20){
                System.out.println("Số lượng tỷ phú không vượt quá 20 !!");
            }
        }while(size>20);
        arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            System.out.print("Nhập vào số tài sản của tỷ  phú thứ "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Danh sách tài sản vừa được nhập vào:  ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        int max = arr[0];
        int index = 1;
        for(int i = 1; i<arr.length; i++){
//            int temp = max;
            if(arr[i]>max){
                max = arr[i];
                index += i;
            }
        }
        System.out.println("Tài sản lớn nhất trong danh sách là: " + max +", ở vị trí "+index);
    }
}
