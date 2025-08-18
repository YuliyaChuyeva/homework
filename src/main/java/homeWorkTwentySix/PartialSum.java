package homeWorkTwentySix;

public class PartialSum implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public PartialSum(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int middle = numbers.length / 2;
        PartialSum first = new PartialSum(numbers, 0, middle);
        PartialSum second = new PartialSum(numbers, middle, numbers.length);
        Thread thread1 = new Thread(first);
        Thread thread2 = new Thread(second);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        int totalSum = first.getSum() + second.getSum();
        System.out.println(totalSum);
    }
}

