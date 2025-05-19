public class Demo {
    public static void main(String[] args) {
//        int a=10;
//        int b= a;
//        a=20;
//        System.out.println("Giá trị của a trước khi swap:"+a);
//        System.out.println("Giá trị của b trước khi swap:"+b);
//        swap(a,b);
//        System.out.println("Giá trị của b sau khi swap:"+b);
//        System.out.println("Giá trị của a sau khi swap:"+a);

    }
    public static void  swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Giá trị của a bên trong method swap:"+a);
        System.out.println("Giá trị của b bên trong method swap:"+b);

    }
    public static void swap(int[] numbers){
        int temp=numbers[0];
        numbers[0]=numbers[1];
        numbers[1]=temp;
    }
}
