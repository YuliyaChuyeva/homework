package homeWorkTen_taskSeven;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Настя", 33, 7.5);
        Student student2 = new Student("Koстя", 40, 8.5);
        Student student3 = new Student("Нина", 23, 4.5);
        Student student4 = new Student("Саша", 50, 2.5);
        Course javacourse = new Course("Java");
        Course pytoncourse = new Course("Pyton");
        Group java1group = new Group("Java1");
        Group python1group = new Group("Python1");
        java1group.addStudent(student1);
        java1group.addStudent(student2);
        python1group.addStudent(student3);
        python1group.addStudent(student4);

        javacourse.addGroup(java1group);
        pytoncourse.addGroup(python1group);

        javacourse.printStudentsCourse();
        pytoncourse.printStudentsCourse();

        System.out.println("Средняя успеваемость в группе " + java1group.getGroupName() + ":" + java1group.calculateAverageGroup());


    }
}
