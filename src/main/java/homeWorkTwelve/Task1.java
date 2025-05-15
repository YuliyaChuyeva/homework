package homeWorkTwelve;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Task1 {
    public static void main(String[] args) {
        String[] names = new String[6];
        names[0] = "Julia";
        names[1] = "Pavel";
        names[2] = "Sveta";
        names[3] = "Petr";
        names[4] = "Maks";
        names[5] = "Julia";
        Set<String> set = new HashSet<>(Arrays.asList(names));
        System.out.println("Набор уникальных элементов set: "+ set);
    }
}
