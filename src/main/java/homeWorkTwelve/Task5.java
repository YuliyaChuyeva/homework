package homeWorkTwelve;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        List<String > name = new ArrayList<>();
        name.add("Mark");
        name.add("Karl");
        name.add("Leon");
        name.add("Teona");
        name.add("Malika");
        name.add("Alice");
        Set<String> sortName = new TreeSet<>(name);
        System.out.println("Имена в отсортированном порядке:" + sortName);
    }
}
