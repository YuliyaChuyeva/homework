package homeWorkTwentyFour.streamsOptional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class Task2 {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "kiwi", "banana");
        Map<Integer, List<String>> map = fruits.stream().collect(Collectors.groupingBy(String::length));
        for (Map.Entry<Integer, List<String>> fruit : map.entrySet()) {
            System.out.println(fruit.getKey() + ":" + fruit.getValue());
        }
    }
}
