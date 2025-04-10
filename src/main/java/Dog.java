public class Dog {
    String name;
    String breed;
    int age;
    double weight;

    public Dog(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, String breed) {
        this(name, breed, 1, 5.0);
    }

    public void bark() {
        for (int i = 1; i <= age; i++) {
            System.out.println("Bark!");
        }
    }

    public void eat(double foodWeight) {
        weight = weight + (foodWeight / 2);
        System.out.println(weight);
    }


    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", "German Shepherd", 6, 30.0);
        Dog dog2 = new Dog("Bella", "Golden Retriever");
        dog2.bark();
        dog1.eat(2.5);

    }
}
