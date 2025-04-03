public class Task4 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 5;
        char operation = '*';

        switch (operation){
            case '-':
                System.out.println(num1-num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Неизвестная операция");
        }
    }
}
