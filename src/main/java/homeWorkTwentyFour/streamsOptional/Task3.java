package homeWorkTwentyFour.streamsOptional;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4);
        int sum = numbers.stream().mapToInt(n -> n * n).sum();
        System.out.println(sum);
    }
}
