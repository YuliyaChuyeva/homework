package homeWorkTen_taskSeven;

class Course {
    private String courseName;
    private int groupCount;
    private Group[] groups;

    public Course(String courseName) {
        this.courseName = courseName;
        this.groupCount = 0;
        this.groups = new Group[10];
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGroupCount() {
        return groupCount;
    }

    public void addGroup(Group group) {
        if (groupCount < groups.length) {
            groups[groupCount] = group;
            groupCount++;
        } else {
            System.out.println("все места на курсе заняты");
        }
    }

    public void printStudentsCourse(){
        System.out.println("Все студенты на курсе " + courseName);
        for (int i=0;i<groupCount;i++){
            groups[i].printGroup();
        }
    }
}
