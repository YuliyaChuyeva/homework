import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LessonSet2 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Amelia");
        names.add("Ruslan");
        names.add("Bob");

        System.out.println(names);
        names.add("Igor");
        System.out.println(names);

        Set<String> names2 = new LinkedHashSet<>();
        names2.add("Marysya");
        names2.add("Timur");
        System.out.println(names2);
        names2.addAll(names);
        System.out.println(names2);
        names.addAll(names2);
        System.out.println(names);
    }
}
