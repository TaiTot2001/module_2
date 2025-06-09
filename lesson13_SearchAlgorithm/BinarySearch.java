public class BinarySearch {
    public static void main(String[] args) {
        int[] arr ={6,13,14,25,33,43,51,53,64,72,84,93,96,};
        int target = 65;
        int result=binarySearch(arr,target);
        if(result!=-1){
            System.out.println("tim thay phan tu "+ target +" o vi tri: "+result);
        }
        else{
            System.out.println("khong tim thay phan tu "+ target +" o trong mang ");
        }
    }
    public static int binarySearch(int[] arr,int target){
        int low = 0;
        int high=arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if (arr[mid]==target){
                return mid;
            }
            else if (arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }
        return -1;

    }
}
