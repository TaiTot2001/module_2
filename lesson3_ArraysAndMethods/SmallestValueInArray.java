public class SmallestValueInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,0,7,8,9,10};
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+smallestValue(arr));
    }
    public static int smallestValue(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
