import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "mãi yêu em nhiều eeeee";
        System.out.println("str = " + str);
        System.out.print("Hãy nhập vào một kí tự mà bạn muốn đếm: ");
        String input = sc.next();
        while (input.length() != 1) {
            System.out.print("Vui lòng chỉ nhập 1 ký tự mà bạn muốn đếm: ");
            input = sc.next();
        }
        char character = input.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Ký tự "+input+" được lặp lại "+count+" lần trong mảng");
    }
}
