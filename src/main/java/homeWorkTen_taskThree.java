import java.util.Arrays;

public class homeWorkTen_taskThree {
    public static void main(String[] args) {
        int[] array = {2, 8, 9, 44, 77, 98, 99};
        int indexRemove = 4;
        if (indexRemove < 0 || indexRemove >= array.length) {
            System.out.println("Invalid indexRemove");
            return;
        }
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != indexRemove) {
                newArray[j] = array[i];
                j++;
            }
        }
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
    }
}
