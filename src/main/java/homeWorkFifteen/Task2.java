package homeWorkFifteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task2 {
    public static void main(String[] args) {
        String text = "Сегодня, 2025-04-05, погода радует теплом и солнцем.\n" +
                "По прогнозам синоптиков, 2025-04-07 ожидается резкое похолодание.\n" +
                "Мы планируем поездку на природу 2025-05-10, если погода стабилизируется.\n" +
                "Встреча с коллегами назначена на 2025-04-06, за день до ухудшения погодных условий.\n" +
                "Крайний срок сдачи проекта — 2025-04-30, поэтому работаем плотно";
        String regex = "(\\d{4})-(\\d{2})-(\\d{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String year = matcher.group(1);
            String month = matcher.group(2);
            String day = matcher.group(3);
            System.out.println("Found date: " + matcher.group());
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
        }
    }
}
