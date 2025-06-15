package homeWorkTwentyTwo;

import java.util.function.Function;


public class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = string -> string.length();
        System.out.println(stringLength.apply("Java"));
        System.out.println(stringLength.apply("Functional Interface"));
        System.out.println(stringLength.apply("Hello"));

    }
}
