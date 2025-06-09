import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao kich thuoc cua mang: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Nhap vao "+list.length+ " gia tri: ");
        for(int i = 0; i<list.length; i++){
            System.out.print("Gia tri "+(i+1)+": ");
            list[i] = sc.nextInt();
        }
        System.out.print("Mang ban  nhap vao: ");
        System.out.println(Arrays.toString(list));
        System.out.println("Bat dau xu ly sap xep......");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list){
        boolean needNextPass = true;
        for(int k=1; k< list.length&&needNextPass; k++){
            needNextPass = false;
            for(int i = 0; i < list.length-k; i++){
                if (list[i]>list[i+1]){
                    System.out.println("Doi cho "+list[i]+" voi "+list[i+1]);
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;
                    needNextPass = true;
                }
            }
            if(needNextPass==false){
                System.out.println("Mang da duoc sap xep tu truoc!");
                break;
            }
            System.out.println("Mang duoc sap xep sau lan thu "+k+" la:");
            System.out.println(Arrays.toString(list));
            System.out.println();
        }
    }
}
