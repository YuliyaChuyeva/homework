package lessonSix_taskTwo;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Jack",28,4000);
        Manager manager = new Manager("Kate", 26,4300,230);
        Intern intern = new Intern("Maks", 21,1200);
        employee.printInfo();
        manager.printInfo();
        intern.printInfo();
    }




}
