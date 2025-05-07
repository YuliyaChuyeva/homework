package homeWorkTen_taskSeven;

class Student extends Person{

    private double averageGrade;
    public Student(String name, int age, double averageGrade) {
        super(name, age);
        this.averageGrade=averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return super.toString() + ".Средняя оценка:" + averageGrade;
    }
}
