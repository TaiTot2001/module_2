package BT_ThucHanh1;

public class BinarySearch {
    static int[] List = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(List, 2));
        System.out.println(binarySearch(List, 11));
        System.out.println(binarySearch(List, 79));
        System.out.println(binarySearch(List, 1));
        System.out.println(binarySearch(List, 12));
        System.out.println(binarySearch(List, 14));
    }
}
