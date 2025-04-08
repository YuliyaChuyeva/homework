public class Homework2Task5 {
    public static void main(String[] args) {
        int counter = 9;
        do {
            counter++;
            if (counter < 20) {
                System.out.println(counter + "меньше 20");
            } else if (counter >= 20) {
                if (counter == 25) {
                    System.out.println("Особое число " + counter);
                } else {
                    System.out.println(counter + "Больше или равно 20");
                }
            }

        }
        while (counter < 30);

    }
}
