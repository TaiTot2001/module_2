import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String AccountRegex = "^[a-z0-9_]{6,}";

    public AccountExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(AccountRegex);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String account : validAccount) {
            System.out.printf("%-20s : %s\n", account, accountExample.validate(account));

        }
        for (String account : invalidAccount) {
            System.out.printf("%-20s : %s\n", account, accountExample.validate(account));

        }

    }
}
