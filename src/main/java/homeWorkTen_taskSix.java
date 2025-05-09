public class homeWorkTen_taskSix {
    public static void main(String[] args) {
        int[][] arr = {{4, 3, 2}, {3, 2, 7}, {6, 8, 2}};
        int stroka = arr.length;
        int columns = arr[0].length;
        int[][] transporter = new int[columns][stroka];
        for (int i = 0; i < stroka; i++) {
            for (int j = 0; j < columns; j++) {
                transporter[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "");
            }
            System.out.println();
        }
        for (int[] str : transporter) {
            for (int element : str) {
                System.out.println(element + " ");
            }
            System.out.println();
        }
    }
}
