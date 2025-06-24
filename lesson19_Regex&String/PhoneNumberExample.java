import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static final String phoneNumberRegex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
    private static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    private static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};
    public static boolean isValidPhoneNumber(String regex) {
        Pattern pattern = Pattern.compile(phoneNumberRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        for (String phoneNumber : validPhoneNumber) {
            System.out.printf("%-20s : %s\n",phoneNumber,isValidPhoneNumber(phoneNumber));
        }
        for (String phoneNumber : invalidPhoneNumber) {
            System.out.printf("%-20s : %s\n",phoneNumber,isValidPhoneNumber(phoneNumber));
        }
    }

}
