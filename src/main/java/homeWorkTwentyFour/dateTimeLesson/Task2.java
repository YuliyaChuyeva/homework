package homeWorkTwentyFour.dateTimeLesson;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Task2 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH.mm");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH mm ss a ");
        String formatted = localTime.format(formatter);
        String formatted2 = localTime.format(formatter2);
        String formatted3 = localTime.format(formatter3);
        System.out.println(formatted);
        System.out.println(formatted2);
        System.out.println(formatted3);
    }
}
