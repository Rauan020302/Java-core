package algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,6,3,2,4,7,8,9,0};

        System.out.println(linearSearch(arr,4));
    }
    public static int linearSearch (int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return i;

        }
        return -1;
    }
}
