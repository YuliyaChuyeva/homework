package homeWorkNineteen;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Task2 {
    public static void main(String[] args) {
        String path = "src/main/resources/settings.properties";
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(path));
            if (properties.getProperty("username") == null || ("app.title") == null || ("app.version") == null) {
                System.out.println("Ошибка, не все данные присутствуют в файле");
            } else {
                System.out.println("Все настройки найдены");
                System.out.println("Имя пользователя:" + properties.getProperty("username"));
                System.out.println("Название приложения:" + properties.getProperty("app.title"));
                System.out.println("Версия приложения:" + properties.getProperty("app.version"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
