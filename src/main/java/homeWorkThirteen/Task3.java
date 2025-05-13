package homeWorkThirteen;

import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        String word = "madam";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
        boolean isPalindrom = true;
        for (int i = 0; i < word.length(); i++) {
            if (stack.pop() != word.charAt(i)) {
                isPalindrom = false;
                break;
            }
        }
        if (isPalindrom) {
            System.out.println(word + " - является палиндромом");
        } else {
            System.out.println(word + " - не является палиндром");
        }
    }
}



