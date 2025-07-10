package homeWorkTwentySix;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Task5 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i <= 10; i++) {
            int taskNumber = i;
            executorService.submit(() -> System.out.println(Thread.currentThread().getName() +
                    " обработал задачу № " + taskNumber));
        }
        executorService.shutdown();
    }
}
