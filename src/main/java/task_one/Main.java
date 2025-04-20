package task_one;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat("Vasiliy");
        Animal cat1=new Cat("Boris");
        cat.makeSound();
        cat.eat();
        cat1.makeSound();
        //cat1.eat - error


    }
}
