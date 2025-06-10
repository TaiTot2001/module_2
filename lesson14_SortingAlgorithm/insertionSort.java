import java.util.Arrays;

public class insertionSort {
    static double[] list ={2,5,1,6,4.5,8,3,};
    public static void insertion(double[] list) {
        for(int i=1;i<list.length;i++) {
            double x = list[i];
            int pos = i;
            while(pos>0 && x<list[pos-1]) {
                list[pos] = list[pos-1];
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertion(list);
        System.out.println(Arrays.toString(list));
    }
}
