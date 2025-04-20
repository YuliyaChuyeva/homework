package task_two;

public class Greeting {

    public void sayHello(String string){
        System.out.println(string);
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayHello(String name, int age){
        System.out.println(name +" " +  age);
    }

    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        greeting.sayHello();
        greeting.sayHello("Ola");
        greeting.sayHello("Julia", 33);
    }
}
