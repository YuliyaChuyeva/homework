package homeworkSeven_taskTwo;

public abstract class Animal {

    private String name;
    private String vid;
    private int age;
    private String favoriteFood;
    protected int levelHunger;
    protected int levelEnergy;

    public Animal(String name, String vid, int age, String favoriteFood) {
        this.name = name;
        this.vid = vid;
        this.age = age;
        this.favoriteFood = favoriteFood;
        this.levelHunger = 50;
        this.levelEnergy = 50;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getVid() {
        return vid;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getLevelHunger() {
        return levelHunger;
    }

    public int getLevelEnergy() {
        return levelEnergy;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setLevelHunger(int levelHunger) {
        this.levelHunger = levelHunger;
    }

    public void setLevelEnergy(int levelEnergy) {
        this.levelEnergy = levelEnergy;
    }

    public abstract void voice();


    public abstract void feed(String food);

    public void walk() {
        if (levelEnergy > 20) {
            levelEnergy = levelEnergy - 20;
            levelHunger = levelHunger + 10;
            System.out.println(name + " (" + vid + ") гуляет. Энергия уменьшилась до " + levelEnergy + ", голод увеличился до " + levelHunger);
        } else {
            System.out.println(name + " слишком устал(а), чтобы гулять.");
        }
    }

    public void sleep() {
        levelEnergy = levelEnergy + 30;
        levelHunger = levelHunger + 20;
        if (levelEnergy > 100) {
            levelEnergy = 100;
        } else if (levelHunger > 100) {
            levelHunger = 100;
        }
        System.out.println(name + " (" + vid + ") спит. Энергия восстановилась до " + levelEnergy + ", голод увеличился до " + levelHunger);

    }

}
