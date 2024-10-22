import java.util.HashMap;

public class FastBinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7}; //complexity O(1)
        int target = 5;
        HashMap<Integer, Integer> newArr = new HashMap<>();
        for(int i = 0 ; i< arr.length; i++){
            newArr.put(arr[i],i);
        }
        if(newArr.containsKey(target)){
            System.out.println("Element found at index : "+ newArr.get(target));
        }else{
            System.out.println("Element not found");
        }
    }
}
