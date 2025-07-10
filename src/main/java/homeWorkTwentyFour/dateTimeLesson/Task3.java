package homeWorkTwentyFour.dateTimeLesson;

import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Task3 {
    public static void main(String[] args) {
        ZonedDateTime nowInUTC = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime nowInMoscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        ZonedDateTime nowInTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Дата и Время в UTC: " + nowInUTC);
        System.out.println("Дата и Время в Moscow: " + nowInMoscow);
        System.out.println("Дата и Время в Tokyo: " + nowInTokyo);
    }
}
