public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int target = 1;

        int result = binarySearch( arr, target);
        if(result != -1){
            System.out.println("Element found at index : "+result);
        }else{
            System.out.println("Element not found");
        }
    }
    public static int binarySearch(int[] arr, int target){
        int first = 0;
        int last = arr.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;  // Calculate the middle index

            if (arr[mid] == target) {
                return mid;  // Target found at mid
            } else if (arr[mid] < target) {
                first = mid + 1;  // Search in the right half
            } else {
                last = mid - 1;  // Search in the left half
            }
        }
        return -1;
    }
}
