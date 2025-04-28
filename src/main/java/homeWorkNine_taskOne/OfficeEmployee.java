package homeWorkNine_taskOne;

public class OfficeEmployee extends Employee{
    private double fixSalary;

    public OfficeEmployee(String name, int age,double fixSalary) {
        super(name, age);
        this.fixSalary=fixSalary;
    }

    @Override
    public void calculateSalary() {
        System.out.println(String.format("Сотрудник %s получает %.2f",name,fixSalary));
    }
}
