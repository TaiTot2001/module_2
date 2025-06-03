package BaiTap_2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("C");
        list.addFirst("B");
        list.addFirst("A");
        list.addLast("D");

        System.out.println("First: " + list.getFirst()); // A
        System.out.println("Last: " + list.getLast());   // D
        System.out.println("Index of C: " + list.indexOf("C")); // 2

        list.remove(2); // Remove "C"
        System.out.println("After remove(2), index of D: " + list.indexOf("D")); // 2

        list.remove("D"); // Remove by value
        System.out.println("After remove(\"D\"), contains D: " + list.contains("D")); // false

        MyLinkedList<String> clonedList = list.clone();
        System.out.println("Cloned first element: " + clonedList.getFirst());

        list.ensureCapacity(6);
        System.out.println("List size after ensureCapacity: " + list.size());
        System.out.println(list.contains("A"));
    }
}
