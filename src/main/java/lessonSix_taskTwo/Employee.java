package lessonSix_taskTwo;

public class Employee {
    protected String name;
    protected int age;
    protected double stavka;

    public Employee(String name,int age,double stavka){
        this.name=name;
        this.age=age;
        this.stavka=stavka;
    }

    public double calculateSalary(){
        return stavka;
    }
    public void printInfo() {
        System.out.println("Имя:" + name + " Возраст:" + age + " Зарплата:" + calculateSalary());
    }
}
