package homeWorkTwelve;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 9;
        numbers[2] = 8;
        numbers[3] = 3;
        numbers[4] = 11;
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        System.out.println(set);
    }
}
