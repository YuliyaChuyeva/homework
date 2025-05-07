import java.util.ArrayList;
import java.util.Collections;

public class ListofThings {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Сходить в магазин");
        list.add("Почитать книгу");
        list.add("Позвонить другу");
        list.add("Написать письмо");
        list.add("Выгулять собаку");
        System.out.println(list.get(2));
        list.remove(1);
        list.set(list.size() - 1, "Посмотреть фильм");
        for (String thing : list) {
            System.out.println(thing);
        }
        String shortest = list.get(0);
        String longest = list.get(0);
        for (String str : list) {
            if (str.length() < shortest.length()) {
                shortest = str;
            } else if
            (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("Самая короткая строка: " + shortest);
        System.out.println("Самая длинная строка: " + longest);
        String test = "Сходить в магазн";
        if (list.contains(test)) {
            System.out.println(list.indexOf(test));
        } else {
            System.out.println("Такого элемента нет.");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String thing : list) {
            System.out.println(thing);
        }
        Collections.sort(list);
        for (String thing : list) {
            System.out.println(thing);
        }
        list.clear();
        System.out.println(list.size());
    }
}
