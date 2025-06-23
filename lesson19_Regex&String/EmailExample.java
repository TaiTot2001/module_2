import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private static Matcher matcher;
    private static final String Email_Regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailExample() {
        pattern = Pattern.compile(Email_Regex);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    private static EmailExample emailExample;
    public static final String[] validEmails = new String[]{"1@g.com", "a@i.o", "2@j.1"};
    public static final String[] invalidEmails = new String[]{".@.com", "@j.1", "j@%aa.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmails) {
            boolean isvalid = emailExample.validate(email);
            System.out.println(email + ": " + isvalid);
        }
        for (String email : invalidEmails) {
            boolean isvalid = emailExample.validate(email);
            System.out.println(email + ": " + isvalid);
        }
    }


}
