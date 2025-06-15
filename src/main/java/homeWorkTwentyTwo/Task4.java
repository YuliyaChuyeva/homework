package homeWorkTwentyTwo;

import java.util.function.Function;

public class Task4 {
    public static void main(String[] args) {
        Function<Integer, Integer> function = a -> a * 5;
        int[] arr = {2, 4, 6, 8};
        for (int a : arr) {
            System.out.println(function.apply(a));
        }


    }
}
