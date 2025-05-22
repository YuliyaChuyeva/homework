package homeWorkFifteen;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {

    public static void main(String[] args) {
        String text = "Сегодня я начал изучать, как использовать регулярные выражения в Java.\n" +
                "#regex оказался мощным инструментом для работы с текстом и поиска паттернов.\n" +
                "Я написал свой первый парсер дат с помощью #java и регулярных выражений.\n" +
                "Этот опыт помог мне лучше понять, как применять #coding-навыки в реальных задачах.";
        String regex = "#([a-zA-Z0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String hashtag = matcher.group(1);
            System.out.println("Found hashtag: " + hashtag);
        }
    }
}
