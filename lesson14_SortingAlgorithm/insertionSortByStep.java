import java.util.Arrays;

public class insertionSortByStep {

    public static void insertion(double[] list) {
        for (int i = 1; i < list.length; i++) {
            int pos = i;
            double x = list[i];
            System.out.println("Chen phan tu " + x + " vao vi tri thich hop");
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1];
                pos--;
            }
            list[pos] = x;
            System.out.println("Mang sau khi chen phan tu " + x);
            System.out.println(Arrays.toString(list));
            System.out.println("-----------------------------------------------");

        }
        System.out.println("Mang sau khi ket thuc qua sap xep : ");
        System.out.println(Arrays.toString(list));
    }

    public static void main(String[] args) {
        double[] list = {5, 2, 1, 6, 4.5, 8, 3,};
        System.out.println("Mang truoc khi chen phan tu: \n" + Arrays.toString(list));
        System.out.println();
        System.out.println("Bat dau thuc hien qua trinh sap xep chen: ............");
        System.out.println();
        insertion(list);
    }
}
