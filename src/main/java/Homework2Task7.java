public class Homework2Task7 {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(69));
        System.out.println(sumOfDigits(75));
    }


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum = sum + number % 10;
            number = number /10;
        }
        return sum;
    }
}
