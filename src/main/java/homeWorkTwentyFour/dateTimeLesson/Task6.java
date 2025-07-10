package homeWorkTwentyFour.dateTimeLesson;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Task6 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2025, 6, 18);
        String result = localDate.isBefore(specificDate) ? "Текущая дата раньше" :
                localDate.isAfter(specificDate) ? "Текущая дата позже" : "Даты совпадают";
        System.out.println(result);
        long daysBetween = ChronoUnit.DAYS.between(localDate, specificDate);
        System.out.println(Math.abs(daysBetween));
    }
}
