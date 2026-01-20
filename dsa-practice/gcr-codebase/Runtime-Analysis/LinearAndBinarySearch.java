
public class LinearAndBinarySearch {
    public static void LinearSearch(int[] arr,int target){
        long start = System.nanoTime();
        for(int val:arr){
            if(val==target){
                long end = System.nanoTime();
                System.out.println("Time Taken by linear search: "+(end-start)+"ns");
            }
        }
    }
    public static void binarySearch(int[] arr, int target) {

        long start = System.nanoTime();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2; // avoids overflow

            if (arr[mid] == target) {
                long end = System.nanoTime();
                System.out.println("Time Taken by binary search: "+(end-start)+"ns");
                break;
            }
            else if (arr[mid] < target) {
                left = mid + 1; // search right side
            }
            else {
                right = mid - 1; // search left side
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 2;
        LinearSearch(arr,target);
        binarySearch(arr,target);

    }
}
