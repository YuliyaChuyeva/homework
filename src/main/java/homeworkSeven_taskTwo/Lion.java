package homeworkSeven_taskTwo;

public class Lion extends Animal{

    public Lion(String name, String vid, int age, String favoriteFood) {
        super(name, vid, age, favoriteFood);
    }

    @Override
    public void voice() {
        System.out.println(getName() + "рычит RRR");
    }

    @Override
    public void feed(String food) {
         if (food.equals(getFavoriteFood())) {
            levelHunger = levelHunger - 30;
            if (levelHunger < 0) {
                levelHunger = 0;
                System.out.println(getName() + " ест " + getFavoriteFood() + ". Голод уменьшился до " + levelHunger);
            }
        } else {
            System.out.println(getName() + " не ест . Это не его любимая еда.");
        }
    }
    }

