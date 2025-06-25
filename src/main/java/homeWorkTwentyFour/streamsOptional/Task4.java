package homeWorkTwentyFour.streamsOptional;

import java.util.Optional;

public class Task4 {
    public static void main(String[] args) {
        String s = null;
        String result = Optional.ofNullable(s).map(String::toUpperCase).orElse("NONE");
        System.out.println(result);
    }
}
