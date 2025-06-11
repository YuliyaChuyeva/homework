package homeWorkTwentyOne;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(vozvedenie(2, 3));
    }

    public static int vozvedenie(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * vozvedenie(a, b - 1);
    }
}
