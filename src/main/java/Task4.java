public class Task4 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        char operation = '*';

        switch (operation){
            case '-':
                System.out.println("Вычитание");
                break;
            case '+':
                System.out.println("Сложение");
                break;
            case '*':
                System.out.println("Умножение");
                break;
            case '/':
                System.out.println("Деление");
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
