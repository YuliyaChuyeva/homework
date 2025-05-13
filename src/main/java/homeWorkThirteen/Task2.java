package homeWorkThirteen;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task2 {
    public static void main(String[] args) {
        Deque<String> list = new ArrayDeque<>();
        list.add("Обновить документы");
        list.add("Исправить баг");
        list.add("Запустить сборку");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
