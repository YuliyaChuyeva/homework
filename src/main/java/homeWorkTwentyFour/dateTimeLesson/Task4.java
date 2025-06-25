package homeWorkTwentyFour.dateTimeLesson;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Task4 {
    public static void main(String[] args) {
        ZoneId london = ZoneId.of("Europe/London");
        ZoneId moscow = ZoneId.of("Europe/Moscow");
        myMethod(london, moscow);
        ZoneId utc = ZoneId.of("UTC");
        ZoneId tokyo = ZoneId.of("Asia/Tokyo");
        myMethod(utc, tokyo);
    }

    public static void myMethod(ZoneId zoneId, ZoneId zoneId2) {
        int firstCountry = ZonedDateTime.now(zoneId).getOffset().getTotalSeconds();
        int secondCountry = ZonedDateTime.now(zoneId2).getOffset().getTotalSeconds();
        long different = Math.abs(firstCountry - secondCountry) / 3600;
        System.out.println("Разница во времени между " + zoneId + " и " + zoneId2 + ": " + different);
    }
}
