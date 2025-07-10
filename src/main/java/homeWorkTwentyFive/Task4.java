package homeWorkTwentyFive;

import java.util.ArrayList;
import java.util.List;

//Задача 4: Lower Bound wildcard
//Список имеет родительский тип ? super Integer. Добавьте в него числа и выведите содержимое.
public class Task4 {

    public static void addNumbers(List<? super Integer> list){
        list.add(71);
        list.add(473);
        list.add(772);
        list.add(17);
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addNumbers(list);
        System.out.println(list);
    }
}
