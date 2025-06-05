package homeWorkEighteen;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "src/main/resources/quotes.txt";
        System.out.println("Введите слова:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase("STOP")) {
                    break;
                } else {
                    writer.write(line);
                    writer.write("\n");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка в " + fileName);
            e.printStackTrace();
        }
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String l;
            System.out.println("Введенные слова:");
            while ((l = bufferedReader.readLine()) != null) {
                System.out.println(l);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
