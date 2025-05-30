package homeWorkSeventeen;

public class Task2 {
    public static void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } finally {
            System.out.println("Метод завершен.");
        }
    }

    public static void main(String[] args) {
        divide(3, 0);
        divide(6, 2);
    }
}

