public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Person(){
    }

    public void talk(){
        System.out.println("Hello, I am " + name);
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice",25);
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 30;
        person2.talk();

    }
}

