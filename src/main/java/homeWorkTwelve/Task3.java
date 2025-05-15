package homeWorkTwelve;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Milk","Bread","Kefir","Cake","Milk");
        Set<String> set = new LinkedHashSet<>(list);
        System.out.println(set);
    }
}
