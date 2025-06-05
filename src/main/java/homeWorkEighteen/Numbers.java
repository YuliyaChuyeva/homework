package homeWorkEighteen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            int sum = 0;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                for (int i = 0; i < parts.length; i++) {
                    int number = Integer.parseInt(parts[i]);
                    sum += number;
                }
                System.out.println(sum);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
