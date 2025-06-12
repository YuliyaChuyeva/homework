package homeWorkTwenty;

import java.util.Scanner;

public class CoffeeShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кофе на выбор: CAPPUCCINO,ESPRESSO,LATTE");
        CoffeeType coffeeType = null;
        while (coffeeType == null) {
            String choice = scanner.nextLine().toUpperCase();
            try {
                coffeeType = CoffeeType.valueOf(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("Вы введи неверный вариант, попробуйте снова.");
            }
        }

        System.out.println("Введите количество чашек");
        int kolichestvo = 0;
        while (kolichestvo <= 0) {
            try {
                kolichestvo = scanner.nextInt();
                if (kolichestvo <= 0) {
                    System.out.println("Количество должно быть положительным.");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        int totalCost = coffeeType.getPrice() * kolichestvo;
        getInfo(coffeeType, kolichestvo, totalCost);
    }

    private static void getInfo(CoffeeType coffeeType, int kolichestvo, int totalCost) {
        System.out.println(String.format("Ваш напиток:%s.\nОбъем напитка:%s.\nВ количестве %d шт." +
                " \nИтоговая стоимость %d рублей.", coffeeType.getName(), coffeeType.getDescription(), kolichestvo, totalCost));
    }
}
