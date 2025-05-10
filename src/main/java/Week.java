public class Week {

    private String day;
    private boolean isVacation;


    public Week(String day, boolean isVacation){
        this.day=day;
        this.isVacation=isVacation;
    }
    public String getDay() {
        return day;
    }

    public boolean isVacation(){
        return isVacation;
    }
    public void setVacation(boolean isVacation) {
        this.isVacation = isVacation;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void typeDay(){
        if (day.equals("Saturday") || day.equals("Sunday") || isVacation) {
            System.out.println("Сегодня выходной!");
        } else {
            System.out.println("Сегодня рабочий день.");
        }
    }

    public static void main(String[] args) {
        Week weekDay1 = new Week("Saturday",false);
        Week weekDay2 = new Week("Monday",true);
        Week weekDay3 = new Week("Wednesday",false);
        weekDay1.typeDay();
        weekDay2.typeDay();
        weekDay3.typeDay();

    }
}