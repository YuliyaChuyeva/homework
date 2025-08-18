package homeWorkTwentySix;

class Task1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Работает поток " + Thread.currentThread().getName() + ".Я выполняюсь!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Task1 thread1 = new Task1();
        Task1 thread2 = new Task1();
        Task1 thread3 = new Task1();
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
