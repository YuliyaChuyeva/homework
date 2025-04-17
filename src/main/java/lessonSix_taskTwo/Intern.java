package lessonSix_taskTwo;

public class Intern extends Employee{
    public Intern(String name, int age, double stavka) {
        super(name, age, stavka);
    }

    @Override
    public double calculateSalary() {
        return stavka=1000;
    }

    @Override
    public void printInfo() {
        System.out.println("Интерн: ");
        super.printInfo();
    }
}
