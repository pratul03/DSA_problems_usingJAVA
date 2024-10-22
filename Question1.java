import java.util.HashMap;

//find the first unique occurrence in the string
public class Question1 {
    public static void main(String[] args) {
        String ex = "aabccddeeff";
        char res = findUniqueChar(ex);
        if(res != '-' ){
            System.out.println("First unique character: " + res);
        } else {
            System.out.println("No unique character found!!");
        }
    }

    public static char findUniqueChar(String ex) {
        // Step 1: Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Step 2: Traverse the string and store frequencies of each character
        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 3: Traverse the string again to find the first unique character
        for (int i = 0; i < ex.length(); i++) {
            char ch = ex.charAt(i);
            if (frequencyMap.get(ch) == 1) {
                return ch;  // First unique character found
            }
        }

        // If no unique character is found, return a special character or indication
        return '-';
    }
}