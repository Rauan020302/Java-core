package algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,7));
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (key < arr[middle]) {
                high = middle - 1;
            }else if (key > arr[middle]) {
                low = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
