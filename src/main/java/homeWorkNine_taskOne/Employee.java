package homeWorkNine_taskOne;

public abstract class Employee {
    protected String name;
    protected int age;

    public Employee(String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract void calculateSalary();

    public void showInfo(){
        System.out.println(String.format("Сотрудник %s , ему %d лет работает в нашей компании.", name,age));
    }

}
