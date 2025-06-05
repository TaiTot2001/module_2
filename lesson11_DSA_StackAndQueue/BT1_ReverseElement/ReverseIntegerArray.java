package BT1_ReverseElement;

import java.util.Arrays;
import java.util.Stack;

public class ReverseIntegerArray {
    public static void reverseIntegerArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int number : arr) {
            stack.push(number);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("Mảng ban đầu là:");
        System.out.println(Arrays.toString(arr));

        reverseIntegerArray(arr);
        System.out.println("\nMảng sau khi đảo ngược:");
        System.out.println(Arrays.toString(arr));

    }
}
