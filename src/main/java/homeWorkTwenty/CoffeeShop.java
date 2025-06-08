package homeWorkTwenty;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        System.out.println("Введите кофе на выбор: CAPPUCCINO,ESPRESSO,LATTE");
        Scanner scanner = new Scanner(System.in);
        String vybor = scanner.nextLine();
        System.out.println("Введите количество чашек");
        int kolichestvo = scanner.nextInt();
        CoffeeType coffeeType = CoffeeType.valueOf(vybor);
        int totalCost = coffeeType.getPrice() * kolichestvo;
        switch (coffeeType) {
            case CAPPUCCINO:
                System.out.println(String.format("Ваш напиток CAPUCCINO:%s,в количестве %d шт." +
                        " Итоговая стоимость %d рублей", coffeeType.getDescription(), kolichestvo, totalCost));
                break;
            case ESPRESSO:
                System.out.println(String.format("Ваш напиток ESPRESSO:%s,в количестве %d шт." +
                        " Итоговая стоимость %d рублей", coffeeType.getDescription(), kolichestvo, totalCost));
                break;
            case LATTE:
                System.out.println(String.format("Ваш напиток LATTE:%s,в количестве %d шт." +
                        " Итоговая стоимость %d рублей", coffeeType.getDescription(), kolichestvo, totalCost));
                break;
            default:
                System.out.println("Не верный выбор.");
                return;
        }
    }
}
