public class Homework2Task8 {
    public static void main(String[] args) {
        multiplicationTable(2);
        multiplicationTable(5);
    }

    public static void multiplicationTable(int number) {
        int i = 1;
        int result;
        while (i <= 10) {
            result = number * i;
            System.out.println(result);
            i++;
        }


    }
}
