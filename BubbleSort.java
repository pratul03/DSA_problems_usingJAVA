import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int [] arr = {6,5,2,9,8,4};
        int len = arr.length;
        int temp;

        System.out.println("Before sorting"+ Arrays.toString(arr));
        for(int i = 0; i  < len ; i++){
            for(int j = 0; j<len-i-1 ; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("after sorting"+Arrays.toString(arr));
    }
}
