import java.util.HashSet;
import java.util.Set;

public class LessonSet {
    public static void main(String[] args) {
        Set<Integer> sety = new HashSet<>();
        sety.add(14);
        sety.add(67);
        sety.add(98);
        System.out.println(sety);

        Set<Integer> sety2 = new HashSet<>();
        sety2.add(72);
        sety2.add(1);
        sety2.add(14);
        sety2.add(72);

        sety.retainAll(sety2);
        System.out.println(sety);
    }
}
