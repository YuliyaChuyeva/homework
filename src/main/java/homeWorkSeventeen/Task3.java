package homeWorkSeventeen;

public class Task3 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 5, 9, 6};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс выходит за границы числа.");
        } catch (NumberFormatException e) {
            System.out.println("Индекс указан в некорректном формате.");
        } finally {
            System.out.println("Конец программы.");
        }
    }
}
