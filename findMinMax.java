//public class findMinMax {
//    public static void main(String[] args) {
//        int [] arr = { 3 ,4 ,5 ,6 ,2,8};
//        int max = arr[0], min = arr[0];
//        for(int i : arr){
//            if( i > max) max = i;
//            if(i < min ) min = i ;
//        }
//        System.out.println("maximum num : "+max);
//        System.out.println("minimum num : "+min);
//    }
//}

import java.util.Scanner;

public class findMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // Get user input for the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize min and max with the first element of the array
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to find min and max
        for (int i = 1; i < size; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the results
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        scanner.close();
    }
}

