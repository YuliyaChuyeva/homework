package homeWorkTwentyTwo;

import java.util.function.Supplier;


public class Task8 {
    public static void main(String[] args) {
        Supplier<Long> dateSupplier = () -> System.currentTimeMillis();
        System.out.println(dateSupplier.get());
    }
}

