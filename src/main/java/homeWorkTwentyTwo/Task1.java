package homeWorkTwentyTwo;

import java.util.function.Predicate;


public class Task1 {
    public static void main(String[] args) {
        Predicate<Integer> isChetnoe = n -> n % 2 == 0;
        int[] numbers = {10, 15, 20, 25};
        for (int number : numbers) {
            if (isChetnoe.test(number)) {
                System.out.println("Число " + number + " - четное");
            } else {
                System.out.println("Число " + number + " - нечетное");
            }
        }
    }
}
