package lessonSix_taskTwo;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, int age, double stavka,double bonus) {
        super(name, age, stavka);
        this.bonus=bonus;
    }

    @Override
    public double calculateSalary() {
        return stavka+bonus;
    }

    @Override
    public void printInfo() {
        System.out.println("Менеджер: ");
        super.printInfo();
        System.out.println("Бонус: " + bonus);
    }
}
