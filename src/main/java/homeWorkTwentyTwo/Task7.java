package homeWorkTwentyTwo;

import java.util.function.Supplier;

public class Task7 {
    public static void main(String[] args) {
        Supplier<Integer> random = () -> (int) (Math.random() * 100) + 1;
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
    }
}
