import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Stack;

public class Lesson13 {
    public static void main(String[] args) {
        PriorityQueue<String> names = new PriorityQueue<>();
        names.add("Mikhail");
        names.add("Ivan");
        names.add("Malika");
        while (!names.isEmpty()){
            System.out.println(names.poll());
        }
        ArrayDeque<String> names2 = new ArrayDeque<>();
        names2.addFirst("Mikhail");
        names2.addFirst("Ivan");
        names2.addFirst("Malika");
        while (!names2.isEmpty()){
            System.out.println(names2.poll());
        }

        Stack<Integer> integers = new Stack<>();
        integers.push(2);
        integers.push(3);
        integers.push(18);
        integers.push(1);
        integers.push(19);

        System.out.println(integers.pop());
        while (!integers.isEmpty()){
            System.out.println(integers.pop());
        }

        System.out.println(integers);
    }
}
