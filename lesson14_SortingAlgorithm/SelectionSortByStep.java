import java.util.Arrays;

public class SelectionSortByStep {
    static double[] list ={5,2,5.4,6.2,4.3,7};
    public static void selection (double[] list){
        for(int i=0; i< list.length-1; i++){
            double currentMin = list[i];
            int currentMinIndex = i;
            for(int j=i+1; j<list.length; j++){
                if(currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if(currentMinIndex != i){
                System.out.println("+ Gia tri nho nhat sau lan thu "+(i+1)+" tim kiem la: "+list[currentMinIndex]+":");
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
                System.out.println("    * Doi cho "+list[currentMinIndex]+" voi "+list[i]);
                System.out.print("    * Mang sau khi sap xep lan "+(i+1)+ " la: ");
                System.out.println(Arrays.toString(list));
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Mang ban dau :");
        System.out.println(Arrays.toString(list));
        System.out.println("--------------------------------------------------------");
        System.out.println("Bat dau xu ly sap xep......");
        selection(list);
//        System.out.println(Arrays.toString(list));

    }
}
