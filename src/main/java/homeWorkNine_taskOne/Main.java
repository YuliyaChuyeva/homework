package homeWorkNine_taskOne;

public class Main {
    public static void main(String[] args) {
        Freelancer freelancer = new Freelancer("Петров Константин",19,1100,40);
        Manager manager = new Manager("Сидоров Илья",23,50000,3950);
        OfficeEmployee officeEmployee = new OfficeEmployee("Степанова Алена", 37,45000);
        freelancer.showInfo();
        freelancer.attendTraining();
        freelancer.calculateSalary();
        manager.showInfo();
        manager.attendTraining();
        manager.calculateSalary();
        officeEmployee.showInfo();
        officeEmployee.calculateSalary();
    }
}
