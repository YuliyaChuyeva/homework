public class Cat {
    String name;
    String color;
    int age;

    public Cat(String name, String color, int age){
        this.name=name;
        this.color = color;
        this.age=age;
    }
    public Cat(String name){
        this.name=name;
    }

    public void meow(){
        for(int i=1; i<=age;i++){
            System.out.println("meow");
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Grey", "grey",5);
        Cat cat2 = new Cat("Murzik");
        cat1.meow();
    }
}
