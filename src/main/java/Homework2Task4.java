public class Homework2Task4 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;

        while (counter < 50) {

            if (counter % 5 == 0) {
                sum = sum + counter;
                if (sum >= 100) {
                    System.out.println(sum);
                    return;
                }
            }
            counter++;
        }
    }
}

