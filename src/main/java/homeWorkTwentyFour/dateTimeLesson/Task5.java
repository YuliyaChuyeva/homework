package homeWorkTwentyFour.dateTimeLesson;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task5 {
    public static void main(String[] args) {
        String date = "18-06-2025 14:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse(date, formatter);
        DateTimeFormatter resultFormatter = DateTimeFormatter.ofPattern("d LLLL yyyy HH:mm");
        String result = localDateTime.format(resultFormatter);
        System.out.println(result);
    }
}
