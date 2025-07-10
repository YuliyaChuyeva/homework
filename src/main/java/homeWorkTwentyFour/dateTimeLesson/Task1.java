package homeWorkTwentyFour.dateTimeLesson;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd LLLL yyyy");
        String formatted1 = date.format(formatter1);
        String formatted2 = date.format(formatter2);
        String formatted3 = date.format(formatter3);
        System.out.println(formatted1);
        System.out.println(formatted2);
        System.out.println(formatted3);
    }
}
