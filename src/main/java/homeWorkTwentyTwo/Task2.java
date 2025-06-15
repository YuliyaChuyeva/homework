package homeWorkTwentyTwo;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Task2 {
    public static void checkStr(ArrayList<String> list, Predicate<String> prt) {
        for (String str : list) {
            if (prt.test(str)) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Все");
        list.add("Надоело");
        list.add("Я");
        list.add("Очень сильно");
        list.add("Хочу море");
        Predicate<String> predicate = element -> element.length() > 5;
        System.out.println("Строки длиной больше 5 символов:");
        checkStr(list, predicate);
    }
}
