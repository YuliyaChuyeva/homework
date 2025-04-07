public class Homework2Task6 {
    public static void main(String[] args) {
        int i = 1;
        do {
            if (i < 8) {

                System.out.println(i + "Первая половина");
            } else if (i == 8) {
                System.out.println(i + "Середина");
            } else if (i > 8) {
                System.out.println(i + "Вторая половина");
            }
            i++;
        }
        while (i <= 15);
    }
}
