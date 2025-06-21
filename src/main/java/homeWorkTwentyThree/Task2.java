package homeWorkTwentyThree;

import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 9, 2, 15, 6);
        int max = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
    }
}
