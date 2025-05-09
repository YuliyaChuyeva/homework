import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ListOfNumbers {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(76);
        list.add(18);
        list.add(92);
        list.add(66);
        list.add(2);
        list.add(17);
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println("Первый элемент:" + list.getFirst());
        System.out.println("Последний элемент:" + list.getLast());
        list.removeFirst();
        list.removeLast();
        for (int s: list){
            System.out.println(s);
        }
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        for (int s: list){
            System.out.println(s);
        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
