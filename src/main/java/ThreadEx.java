import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadEx {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for (int i=0;i<10;i++){
            executorService.submit(()-> System.out.println(Thread.currentThread().getName()));
        }
        executorService.shutdown();
    }
}
