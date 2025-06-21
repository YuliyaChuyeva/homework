package homeWorkTwentyThree;

import java.util.List;


public class Task {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        long count = numbers.stream()
                .filter(n -> n >= 25)
                .count();
        System.out.println(count);
    }
}
