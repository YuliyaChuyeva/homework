public class Homework2Task6 {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i < 8) {

                System.out.println(i + "Первая половина");
            } else if (i == 8) {
                System.out.println(i + "Середина");
            } else if (i > 8) {
                System.out.println(i + "Вторая половина");
            }

        }
        while (i < 15);
    }
}
