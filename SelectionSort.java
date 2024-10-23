import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num = {5, 2, 3, 7, 8, 4};
        int len = num.length;
        int temp;
        int minIndex = -1;
        System.out.println("Before sorting the array" + Arrays.toString(num));

        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (num[minIndex] > num[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = num[minIndex];
                num[minIndex] = num[i];
                num[i] = temp;
            }
        }
        System.out.println("after sorting the array" + Arrays.toString(num));
    }
}
