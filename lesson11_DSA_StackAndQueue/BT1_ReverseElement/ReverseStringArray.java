package BT1_ReverseElement;

import java.util.Stack;

public class ReverseStringArray {
    public static String reverseStringArray(String input) {
        Stack<String> wStack = new Stack<>();
        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            wStack.push(word);
        }
        StringBuilder reversed = new StringBuilder();
        while (!wStack.isEmpty()) {
            reversed.append(wStack.pop());
            if (!wStack.isEmpty()) reversed.append(" ");
        }
        return reversed.toString();
    }
    public static void main(String[] args) {
        String input = "I love Java";
        System.out.println(input);
        System.out.println(reverseStringArray(input));
    }
}
