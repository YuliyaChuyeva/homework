package homeWorkTwentyFive;

import java.util.Arrays;
import java.util.List;

//Задача 5: Генерик-класс со счётчиком
//Создайте класс, который хранит список элементов и может подсчитать,
// сколько элементов определённого типа (например, String, Integer) содержится в списке.
public class Counter<T> {

    private final List<T> list;

    public Counter(List<T> list) {
        this.list = list;
    }

    public int count(T element) {
        int counter = 0;
        for (T el : list) {
            if (el != null && el.equals(element)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Counter<String> list1 = new Counter<>(Arrays.asList("ananas", "banana", "apple", "apple", "pineapple"));
        System.out.println(list1.count("banana"));
        Counter<Integer> list2 = new Counter<>(Arrays.asList(3, 7, 4, 6, 6, 6, 80, 6, 77));
        System.out.println(list2.count(6));
    }
}
