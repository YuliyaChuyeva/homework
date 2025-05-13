package homeWorkTwelve;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    Set<String> badWords = new HashSet<>(Arrays.asList("bad", "ugly","nasty"));

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.checkBadWord("bad");
    }

    public void checkBadWord(String word) {
        if (badWords.contains(word)) {
            System.out.println("Слово " + word + " запрещенное содержится в списке");
        } else {
            System.out.println("Слово " + word + " не содержится");
        }
    }
}