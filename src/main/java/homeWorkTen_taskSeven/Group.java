package homeWorkTen_taskSeven;

class Group {

    private String groupName;
    private int studentCount;
    private Student[] students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.studentCount = 0;
        this.students = new Student[10];
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Все места в группе заняты");
        }
    }

    public double calculateAverageGroup() {
        double sumAverageGroup = 0.0;
        for (int i = 0; i < studentCount; i++) {
            sumAverageGroup = sumAverageGroup + students[i].getAverageGrade();
        }
        return sumAverageGroup / studentCount;
    }

    public void printGroup() {
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Студенты в группе: " + groupName + "." + students[i]);
        }
    }
}
