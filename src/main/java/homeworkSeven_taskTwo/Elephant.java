package homeworkSeven_taskTwo;

public class Elephant extends Animal {

    public Elephant(String name, String vid, int age, String favoriteFood) {
        super(name, vid, age, favoriteFood);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " Издает звук Слона=)");
    }

    @Override
    public void feed(String food) {
        if (levelHunger < 0 && food.equals(getFavoriteFood())) {
            levelHunger = 0;
            System.out.println(getName() + " не голоден.Голод уменьшился до " + levelHunger);
        }
        if (food.equals(getFavoriteFood())) {
            levelHunger = levelHunger - 30;
            System.out.println("Поел и теперь его голод равен " + levelHunger);
        } else {
            System.out.println(getName() + " не ест . Это не его любимая еда.");
        }
    }
}
