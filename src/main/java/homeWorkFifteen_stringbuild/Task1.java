package homeWorkFifteen_stringbuild;

import java.util.StringJoiner;


public class Task1 {
    public static void main(String[] args) {
        String text = "John: Doe, 30; Jane: Smith, 25; Bob: Brown, 40";
        String[] names = text.split(";");
        StringJoiner joiner = new StringJoiner("\n");
        for (String name : names) {
            name = name.trim();
            String[] n = name.split(": |, ");
            String firstName = n[0];
            String lastName = n[1];
            String age = n[2];
            String formated = String.format("Name: %s %s, Age: %s", firstName, lastName, age);
            joiner.add(formated);
        }
        System.out.println(joiner.toString());
    }
}
