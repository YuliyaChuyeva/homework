public class Student {

    private int score;
    private int classes;
    private boolean hasMedicalCertificate;

    public Student(int score, int classes, boolean hasMedicalCertificate) {
        this.score = score;
        this.classes = classes;
        this.hasMedicalCertificate = hasMedicalCertificate;
    }

    public int getScore() {
        return score;
    }

    public int getClasses() {
        return classes;
    }

    public boolean isHasMedicalCertificate() {
        return hasMedicalCertificate;
    }

    public void setHasMedicalCertificate(boolean hasMedicalCertificate) {
        this.hasMedicalCertificate = hasMedicalCertificate;
    }

    public void setClasses(int classes) {
        this.classes = classes;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void dopysk() {
        if (score >= 65 && classes >= 75) {
            System.out.println("Dopysk");
        } else if (score < 65 && hasMedicalCertificate == true) {
            System.out.println("Dopysk");
        } else {
            System.out.println("Ne dopysk");
        }
    }

    public static void main(String[] args) {
        Student student = new Student(60, 65, true);
        student.dopysk();
        Student student1 = new Student(60, 60, false);
        student1.dopysk();
    }


}
