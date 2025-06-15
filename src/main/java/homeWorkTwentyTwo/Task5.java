package homeWorkTwentyTwo;

import java.util.function.Consumer;


public class Task5 {
    public static void main(String[] args) {
        Consumer<String> printer = string -> {
            System.out.println("\"" + string + "\"");
        };
        printer.accept("Java");
        printer.accept("Consumer");
        printer.accept("Functional");
    }
}
