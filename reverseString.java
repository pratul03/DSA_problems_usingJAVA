public class reverseString {
    public static void main(String[] args) {
        String s = "Pratul";
        System.out.println("Before reversing : ( " +s );
        String rev = "";
        for(int i = s.length() - 1; i >= 0 ; i --){
                rev += s.charAt(i);
        }
        System.out.println("After reversing : ) "+ rev);
    }
}
