package ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0, "a");
        System.out.println(list.get(0));
        System.out.println(list.size());
        list.add(1, "b");
        System.out.println(list.get(1));
        System.out.println(list.size());


        list.add(2, "c");

        String removed = list.remove(2);
        System.out.println("Phần tử đã bị xóa là: " + removed);

        String findLetters = "b";
        boolean contained = list.contains(findLetters);
        System.out.println("Có tìm thấy phần tử " + findLetters + " trong danh sách không: " + contained);

        System.out.println("tìm thấy giá trị ở index="+list.indexOf("a"));


    }
}
