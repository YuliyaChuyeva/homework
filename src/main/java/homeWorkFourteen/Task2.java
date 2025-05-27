package homeWorkFourteen;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<String, String> products = new HashMap<>();
        products.put("Milk", "Drinks");
        products.put("Coffee", "Drinks");
        products.put("Bubble Tea", "Drinks");
        products.put("Bread", "Bakery");
        products.put("Cake", "Bakery");
        Map<String, Integer> countCategory = new HashMap<>();
        for (String product : products.keySet()) {
            String category = products.get(product);
            if (countCategory.containsKey(category)) {
                int count = countCategory.get(category);
                countCategory.put(category, count + 1);
            } else {
                countCategory.put(category, 1);
            }
        }
        System.out.println("Количество товаров в каждой категори:");
        for (String c : countCategory.keySet()) {
            System.out.println(c + ":" + countCategory.get(c));
        }
    }
}

