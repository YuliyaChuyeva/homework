public class Homework2Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i < 30) {
                    System.out.println("Число "+ i+ " Меньше 30");
                } else {
                    System.out.println("Число "+ i + " Больше или равно 30");
                }
            }
        }
    }
}
