package homeWorkSeventeen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Task1 {
    public static void readFile(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
            System.out.println("Файл открыт.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } finally {
            System.out.println("Операция завершена.");
        }
    }

    public static void main(String[] args) {
        readFile("file.txt");
    }
}
