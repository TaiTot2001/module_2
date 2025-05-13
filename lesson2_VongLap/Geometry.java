import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Mục lục: ");
            System.out.println("1. Vẽ hình tam giác.");
            System.out.println("2. Vẽ hình vuông. ");
            System.out.println("3. Vẽ hình chữ nhật");
            System.out.println("0. Thoát");
            System.out.println("Hãy nhập vào lựa chọn của bạn.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hình tam giác:");
                    System.out.println("*");
                    System.out.println("*  *");
                    System.out.println("*  *  *");
                    System.out.println("*  *  *  *");
                    System.out.println("*  *  *  *  *");
                    System.out.println("*  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    break;
                case 2:
                    System.out.println("Hình vuông:");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    break;
                case 3:
                    System.out.println("Hình chữ nhật:");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    System.out.println("*  *  *  *  *  *  *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ !!");
            }
        }

    }
}
