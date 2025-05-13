package homewWorkTwelve_DataType;

public class Task2 {
    public static void main(String[] args) {
        isPalindrom(454);
        isPalindrom(567);
        System.out.println(isPalindromPrimitive(454));
        System.out.println(isPalindromPrimitive(567));
    }

    public static void isPalindrom(int number) {
        String text = Integer.toString(number);
        String reverseText = new StringBuffer(text).reverse().toString();
        System.out.println(reverseText);
        if (text.equals(reverseText)) {
            System.out.println("Является палиндромом");
        } else {
            System.out.println("Не является палиндромом");
        }
    }

    public static boolean isPalindromPrimitive(int n) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int reverse = 0;
        while (n > 0) {
            reverse = reverse * 10 + (n % 10);
            n = n / 10;
        }
        return original == reverse;
    }
}
