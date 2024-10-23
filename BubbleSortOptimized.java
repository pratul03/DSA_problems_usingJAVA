
    import java.util.Arrays;

    public class BubbleSortOptimized {
        public static void main(String[] args) {

            int [] arr = {6, 5, 2, 9, 8, 4};
            int len = arr.length;
            int temp;
            boolean swapped;

            System.out.println("Before sorting: " + Arrays.toString(arr));

            // Outer loop for each pass
            for (int i = 0; i < len - 1; i++) {
                swapped = false;

                // Inner loop to compare adjacent elements
                for (int j = 0; j < len - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap the elements
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }

                // If no two elements were swapped in the inner loop, the array is sorted
                if (!swapped) {
                    break;
                }
            }

            System.out.println("After sorting: " + Arrays.toString(arr));
        }
    }

