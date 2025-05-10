package homeworkSeven_taskTwo;

public class Zookeeper {
    private Animal currentAnimal;

    public Zookeeper(Animal currentAnimal){
        this.currentAnimal=currentAnimal;
    }
    public void setAnimal(Animal animal) {
        this.currentAnimal = animal;
        System.out.println("Смотритель теперь ухаживает за " + animal.getName());
    }
    public void checkStatus() {
        System.out.println("Статус " + currentAnimal.getName() + ": Голод=" + currentAnimal.getLevelHunger() + ", Энергия=" + currentAnimal.getLevelEnergy());
    }

    public void feedAnimal(String food) {
        currentAnimal.feed(food);
    }

    public void walkAnimal() {
        currentAnimal.walk();
    }

    public void letAnimalSleep() {
        currentAnimal.sleep();
    }
}
