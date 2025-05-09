public class homeWorkTen_taskFive {
    public static void main(String[] args) {
        int[][] matrix = {{2, 6, 9}, {1, 9, 7}, {4, 7, 2}};
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        for (int i = 0; i < 3; i++) {
            sumFirstDiagonal = sumFirstDiagonal + matrix[i][i];
            sumSecondDiagonal = sumSecondDiagonal + matrix[i][2 - i];
        }
        System.out.println(sumFirstDiagonal);
        System.out.println(sumSecondDiagonal);
    }
}
