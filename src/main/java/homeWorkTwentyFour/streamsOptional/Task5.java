package homeWorkTwentyFour.streamsOptional;

import java.util.List;
import java.util.Optional;

public class Task5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 25, 3, 47, 19);
        int result = maxNumber(numbers).orElse(-1);
        System.out.println(result);
    }

    public static Optional<Integer> maxNumber(List<Integer> list) {
        return list.stream().max(Integer::compareTo);
    }
}
