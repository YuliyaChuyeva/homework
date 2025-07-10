import java.util.ArrayList;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
   List<String> clothes = new ArrayList<>();
   clothes.add("t-shirt");
   clothes.add("dress");
   clothes.add("trouses");
   print(clothes);
   List<Boolean> booleanList = new ArrayList<>();
   booleanList.add(true);
   booleanList.add(false);
   print(booleanList);
    }

    public static void print(List<?> name){
        name.forEach(System.out::println);
    }
}
