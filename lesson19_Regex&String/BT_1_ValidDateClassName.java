import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BT_1_ValidDateClassName {
    private static final String classNameRegex = "^[CAP][0-9]{4}[GHIK]$";
    private static final String[] validClassNames = {"C0223G", "A0323K","P6385H"};
    private static final String[] invalidClassNames = {"M0318G","P0323A","C03847G"};

    public BT_1_ValidDateClassName() {}
    public boolean validateClassName(String className) {
        Pattern pattern = Pattern.compile(classNameRegex);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }

    public static void main(String[] args) {
        BT_1_ValidDateClassName test = new BT_1_ValidDateClassName();
        for (String className : validClassNames) {
            System.out.printf("%-10s : %s\n",className,test.validateClassName(className));
        }
        for (String className : invalidClassNames) {
            System.out.printf("%-10s : %s\n",className,test.validateClassName(className));
        }
    }



}
