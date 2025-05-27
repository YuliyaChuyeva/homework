package homeWorkFourteen.taskThree;

public class Main {
    public static void main(String[] args) {
        Dish fish = new Dish(1, "Fish", 15.56);
        Dish meat = new Dish(2, "Meet", 25.02);
        Dish salad = new Dish(3, "Salad", 5.12);
        Menu menu = new Menu();
        menu.addDish(fish);
        menu.addDish(meat);
        menu.addDish(salad);
        menu.getDishById(2);
        menu.removeDish(1);
        menu.printAll();
    }
}
