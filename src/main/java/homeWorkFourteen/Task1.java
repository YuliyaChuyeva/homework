package homeWorkFourteen;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 63);
        map.put("Vlad", 81);
        map.put("Viktor", 54);
        map.put("Melissa", 91);
        map.put("Aleks", 45);

        Map<String, Integer> categories = new HashMap<>();
        categories.put("Отлично", 0);
        categories.put("Хорошо", 0);
        categories.put("Удовлетворительно", 0);
        categories.put("Неудовлетворительно", 0);

        for (Integer grade : map.values()) {
            if (grade >= 90 && grade <= 100) {
                categories.put("Отлично", categories.get("Отлично") + 1);
            } else if (grade >= 70 && grade <= 89) {
                categories.put("Хорошо", categories.get("Хорошо") + 1);
            } else if (grade > 50 && grade <= 69) {
                categories.put("Удовлетворительно", categories.get("Удовлетворительно") + 1);
            } else {
                categories.put("Неудовлетворительно", categories.get("Неудовлетворительно") + 1);
            }
        }
        for (String category : categories.keySet()) {
            System.out.println(category + ":" + categories.get(category));
        }
    }
}
