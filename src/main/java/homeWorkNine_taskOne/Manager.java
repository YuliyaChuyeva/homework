package homeWorkNine_taskOne;

public class Manager extends Employee implements Trainable{
    private double baseSalary;
    private double bonus;

    public Manager(String name, int age,double baseSalary,double bonus) {
        super(name, age);
        this.baseSalary=baseSalary;
        this.bonus=bonus;
    }

    @Override
    public void calculateSalary() {
        double salary=baseSalary+bonus;
        System.out.println(String.format("Сотрудник %s получает %.2f",name,salary));
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " проходит тренировку для повышения квалификации.");
    }
}
