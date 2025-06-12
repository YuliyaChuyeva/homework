package homeWorkTwentyOne;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(sumAllNumbers(112));
    }

    public static int sumAllNumbers(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + sumAllNumbers(number / 10);
    }
}
