package homeWorkNineteen;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Double> map = new HashMap<>();
        try (CSVReader reader = new CSVReader(new FileReader("src/main/resources/costs.csv"))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                String date = nextLine[0];
                double price = Double.parseDouble(nextLine[1]);
                String category = nextLine[2];
                map.put(category, map.getOrDefault(category, 0.0) + price);
            }
            for (Map.Entry<String, Double> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }
    }
}

