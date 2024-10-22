import java.util.HashMap;



//String ex= "aabddffeb" find the first unique character in the string using Java. First write the approach and then give the code
//Approach:
//Understand the Problem: You are given a string, and you need to find the first character that is not repeated (i.e., it occurs exactly once in the string). If all characters repeat, return an indication of this (like null or -1).
//
//Steps:
//
//Step 1: Traverse the string and store the frequency of each character in a map or array.
//Step 2: Traverse the string again and check the stored frequencies to find the first character that has a frequency of 1.
//Step 3: Return the first unique character if found; otherwise, return -1.
//Data Structures:
//
//Use a HashMap to store the frequency of each character (character as the key, and its count as the value).
//Time Complexity:
//
//The first traversal takes O(n) to count the frequencies.
//The second traversal takes O(n) to find the first unique character.
//So, overall time complexity is O(n), where n is the length of the string.


import java.util.HashMap;

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
