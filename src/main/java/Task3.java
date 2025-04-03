public class Task3 {

    public static boolean isPalindrome(String text){
        String replaced = text.toLowerCase();
        String reversed = new StringBuffer(replaced).reverse().toString();
        return reversed.equals(replaced);

    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Level"));

    }
}
