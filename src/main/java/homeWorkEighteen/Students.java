package homeWorkEighteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Students {
    public static void main(String[] args) {
        String fileName = "src/main/resources/students.txt";
        Map<String, Integer> groupCountMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String group = parts[2];
                groupCountMap.put(group, groupCountMap.getOrDefault(group, 0) + 1);
                System.out.println(String.format("Имя студента:%s, возраст:%d, учится в группе: %s. ", name, age, group));
            }
        } catch (IOException e) {
            System.out.println("error" + fileName);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("error" + fileName);
            e.printStackTrace();
        }
        System.out.println("Количество студентов в каждой группе:");
        for (Map.Entry<String, Integer> entry : groupCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
