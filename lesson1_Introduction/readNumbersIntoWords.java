import java.util.Scanner;

public class readNumbersIntoWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần đọc: ");
        int number = sc.nextInt();
        String output = "";
        if (number < 10) {
            switch (number) {
                case 1:
                    output = "One";
                    break;
                case 2:
                    output = "Two";
                    break;
                case 3:
                    output = "Three";
                    break;
                case 4:
                    output = "Four";
                    break;
                case 5:
                    output = "Five";
                    break;
                case 6:
                    output = "Six";
                    break;
                case 7:
                    output = "Seven";
                    break;
                case 8:
                    output = "Eight";
                    break;
                case 9:
                    output = "Nine";
                    break;
            }
            ;
        }
    }
}
