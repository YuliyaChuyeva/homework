public class homeWorkTen_taskOne {
    public static void main(String[] args) {
        int[] array = {23, 67, 56, 80, 4, 8, 9, 99, 1};
        int minimum = array[0];
        int maximum = array[0];
        for (int arr : array) {
            if (minimum > arr) {
                minimum = arr;
            }
        }
        for (int arr : array) {
            if (maximum < arr) {
                maximum = arr;
            }
        }
        System.out.println(minimum);
        System.out.println(maximum);
    }
}
