//
//public class Demo {
//    public static void main(String[] args) {
//        int total = add(10, 10);
//        System.out.println(total);
//    }
//
//    public static int add(int a, int b) {
//        return a + b;
//    }
//}
//public class Demo {
//    public static void main(String[] args) {
//        int tru = sub(10,10);
//        System.out.println(tru);
//    }
//    public static int sub(int a, int b) {
//        return a - b;
//    }
//}
public class Demo {
    public static void main(String[] args) {
//        int  chia= div(10,5);
//        System.out.println(chia);
//        int nhan = mul(10, 5);
//        System.out.println(nhan);
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(totalOfArrays(numbers));
    }


    //    public static int div(int a, int b){
//        return a / b;


//    public static int mul(int a, int b){
//        return a * b;
//    }
    public static int totalOfArrays(int[] arr) {
        int total =0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}
