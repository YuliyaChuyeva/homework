package task_one;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }

    public void  eat(){
        System.out.println("I'm eat");
    }

}
