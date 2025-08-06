package finalProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        System.out.println("----Добро пожаловать в интернет магазин----");
        System.out.println("1. Авторизация");
        System.out.println("2. Регистрация");
        System.out.println("3. Выход");
        System.out.println("Выберите действие");
    }

    public void displayAdminMenu() {
        System.out.println("----Меню администратора----");
        System.out.println("1. Посмотреть товары");
        System.out.println("2. Добавить товар");
        System.out.println("3. Удалить товар");
        System.out.println("4. Изменить товар");
        System.out.println("5. Выйти");
        System.out.println("Выберите действие");
    }

    public void displayClientMenu() {
        System.out.println("----Меню пользователя----");
        System.out.println("1. Посмотреть товары");
        System.out.println("2. Добавить товар в корзину");
        System.out.println("3. Просмотреть корзину");
        System.out.println("4. Удалить товар из корзины");
        System.out.println("5. Изменить количество товара в корзине");
        System.out.println("6. Оформить заказ");
        System.out.println("7. Мои заказы");
        System.out.println("8. Выйти");
        System.out.println("Выберите действие");
    }

    public int getUserInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка при вводе, введите корректный int  ");
                scanner.next();
            }
        }
    }

    public String getStringInput() {
        return scanner.next();
    }

    public double getDoubleInput() {
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка, введите правильное число, типа double");
                scanner.next();
            }
        }
    }
}
