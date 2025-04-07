public class Homework2Task3 {
    public static void main(String[] args) {
        int counter = 1;
        while (counter < 20) {
            if (counter <= 10) {
                System.out.println(counter + "- Меньше или равно 10");
            } else if (counter == 15) {
                System.out.println(counter + "- Особоe число 15");
            } else {
                System.out.println(counter + "- Больше 10");
            }
            counter++;
        }
    }
}
