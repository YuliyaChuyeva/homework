package homeWorkTwentyFive;

public class Task2 {
    public static <T extends Number & Comparable<T>> T getMin(T[] array) {
        T min = array[0];
        for (T element : array) {
            if (element != null && element.compareTo(min) < 0) {
                min = element;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 8, 6};
        System.out.println(getMin(numbers));
    }
}
