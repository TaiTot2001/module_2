package Demo;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";
        String str3 = "hello world";
        System.out.println(str1.equalsIgnoreCase(str3));
        List<String> list = new ArrayList<>();

        String str4 = "Anh yêu em nhiều chỉ mong em sẽ hiểu em là phật sống của đời anh";
        for (String s : str4.split("\\s",7)) {
            System.out.println(s);
        }
    }
}
