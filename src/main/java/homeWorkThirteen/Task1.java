package homeWorkThirteen;

import java.util.PriorityQueue;

public class Task1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(2);
        numbers.add(903);
        numbers.add(123);
        numbers.add(33);
        numbers.add(21);
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
