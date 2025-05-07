public class homeWorkTen_taskTwo {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7};
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
        for (int number : array) {
            System.out.println(number);
        }
    }
}
