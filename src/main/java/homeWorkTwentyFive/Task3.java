package homeWorkTwentyFive;

import java.util.List;

public class Task3 {
    public static double sumNumbers(List<? extends Number> list) {
        return list.stream().mapToDouble(Number::doubleValue).sum();
    }

    public static void main(String[] args) {
        List<Number> list = List.of(445, 836, 666, 8363, 90, 67);
        System.out.println(sumNumbers(list));
    }
}
