public class reverseUsingStringBuffer {
    public static void main(String[] args) {
        //Solution 2: Using StringBuffer (Thread-Safe)

        String s = "pratul";
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }
}
