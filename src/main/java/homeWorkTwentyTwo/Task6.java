package homeWorkTwentyTwo;

import java.util.function.Consumer;


public class Task6 {
    public static void main(String[] args) {
        Consumer<Integer> mnozitel = n -> System.out.println(n * 2);
        int[] arr = {3, 6, 9};
        for (int a : arr) {
            mnozitel.accept(a);
        }
    }
}
