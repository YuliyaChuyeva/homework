package homeWorkTwentySix;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Task6 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0;i< numbers.length;i++){
            numbers[i] = i;
        }
        ExecutorService service = Executors.newFixedThreadPool(3);
    }
}
