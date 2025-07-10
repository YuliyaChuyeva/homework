package homeWorkTwentyFour.streamsOptional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task1 {
    public static void main(String[] args) {
        List<List<String>> people = Arrays.asList(List.of("Alice", "Bob"),
                List.of("Charlie", "Dave"));
        List<String> flatList = people.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flatList);
    }
}
