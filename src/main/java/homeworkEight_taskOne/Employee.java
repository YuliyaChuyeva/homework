package homeworkEight_taskOne;

public class Employee {
    public static int totalEmployees = 0;
    private String name;
    private int age;
    private double salary;
    private double bonus;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = calculateBonus();
        totalEmployees++;
    }


    private double calculateBonus() {
       return (salary>70000)?salary*0.1:salary*0.05;
    }

    public void applyRaise(double percent) {
        if(percent<=0){
            System.out.println("Процент не может быть отрицательным.");
            return;
        }
        salary = salary + (salary * (percent / 100));
        bonus=calculateBonus();
    }

    public void getInfo() {
        System.out.println(String.format("Сотрудник %s , его возраст %d получает %.2f и у него бонус %.2f",name,age,salary,bonus));
    }

    public static void showTotalEmployees() {
        System.out.println(String.format("Общее количество сотрудников %d", totalEmployees));
    }
}
     class MainEmployee{
        public static void main(String[] args) {
            Employee employee1=new Employee("Петров Константин", 39, 70000);
            Employee employee2=new Employee("Баргман Давид ", 40, 68000);
            Employee employee3=new Employee("Улер Юлианна", 33, 74000);
            employee1.getInfo();
            employee1.applyRaise(10);
            employee1.getInfo();
            employee2.getInfo();
            employee2.applyRaise(5);
            employee2.getInfo();
            employee3.getInfo();
            Employee.showTotalEmployees();


        }
    }



