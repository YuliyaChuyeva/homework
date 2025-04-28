package homeWorkNine_taskOne;

public class Freelancer extends Employee implements Trainable{
    private double stavka;
    private int hourWorked;

    public Freelancer(String name, int age,double stavka,int hourWorked) {
        super(name, age);
        this.stavka=stavka;
        this.hourWorked=hourWorked;
    }

    @Override
    public void calculateSalary() {
        double zarplata= stavka*hourWorked;
        System.out.println(String.format("Сотрудник %s получает %.2f",name,zarplata));
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " проходит тренировку для повышения квалификации.");
    }
}
