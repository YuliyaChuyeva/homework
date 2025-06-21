package homeWorkTwentyThree;

import java.util.List;


public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> chetnoe = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        List<Integer> nechentnoe = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println(chetnoe);
        System.out.println(nechentnoe);
    }
}
