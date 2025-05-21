package homeWorkFourteen.taskThree;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<Integer, Dish> dishes;

    public Menu() {
        this.dishes = new HashMap<>();
    }

    public void addDish(Dish dish) {
        dishes.put(dish.getId(), dish);
    }

    public void removeDish(int id) {
        if (dishes.containsKey(id)) {
            dishes.remove(id);
        } else {
            System.out.println("Блюда с таким id не найдено.");
        }
    }

    public Dish getDishById(int id) {
        if (dishes.containsKey(id)) {
            return dishes.get(id);
        } else {
            System.out.println("Блюда с таким id не найдено.");
            return null;
        }
    }

    public void printAll() {
        for (Dish dish : dishes.values()) {
            System.out.println(dish);
        }
    }
}
