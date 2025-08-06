package finalProject;

import finalProject.dao.*;
import finalProject.service.AuthorizationService;
import finalProject.service.BasketService;
import finalProject.service.OrderService;
import finalProject.service.ProductService;

import java.util.List;
import java.util.Map;

public class ConsoleUserInterface {
    private AuthorizationService authorizationService;
    private BasketService basketService;
    private OrderService orderService;
    private ProductService productService;
    private FileRepository fileRepository;
    private Menu menu;
    private List<Product> allProducts;

    public ConsoleUserInterface() {
        this.menu = new Menu();
        this.fileRepository = new FileRepository();
        this.allProducts = fileRepository.loadProducts();
        Map<String, User> users = fileRepository.loadUsers();
        this.authorizationService = new AuthorizationService(users);
        this.productService = new ProductService(fileRepository.loadProducts());
        this.basketService = new BasketService();
        Map<Client, List<Order>> loadedOrders = fileRepository.loadOrders(users, allProducts);
        this.orderService = new OrderService(loadedOrders);
    }

    public void run() {
        while (true) {
            menu.displayMainMenu();
            int choice = menu.getUserInput();
            switch (choice) {
                case 1:
                    authenticateUser();
                    break;
                case 2:
                    registerClient();
                    break;
                case 3:
                    saveAndExit();
                    return;
                default:
                    System.out.println("Не верный выбор, попробуйте снова");
            }
        }
    }

    private void registerClient() {
        System.out.println("Введите логин");
        String login = menu.getStringInput();
        System.out.println("Введите пароль");
        String password = menu.getStringInput();
        System.out.println("Введите имя");
        String name = menu.getStringInput();
        if (authorizationService.getUsers().containsKey(login)) {
            System.out.println("Пользователь с таким логином уже существует");
            return;
        }
        Client newClient = new Client(login, password, name);
        authorizationService.register(newClient);
        System.out.println("Регистрация прошла успешно");
    }

    private void authenticateUser() {
        System.out.println("Введите логин");
        String login = menu.getStringInput();
        System.out.println("Введите пароль");
        String password = menu.getStringInput();
        User user = authorizationService.login(login, password);
        if (user instanceof Administrator) {
            adminMenu((Administrator) user);
        } else if (user instanceof Client) {
            clientMenu((Client) user);
        } else {
            System.out.println("Не сработал");
        }
    }

    private void adminMenu(Administrator admin) {
        while (true) {
            menu.displayAdminMenu();
            int choice = menu.getUserInput();
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    editProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Неверный выбор, попробуйте еще");
            }
        }
    }

    private void clientMenu(Client client) {
        while (true) {
            menu.displayClientMenu();
            int choice = menu.getUserInput();
            switch (choice) {
                case 1:
                    displayProduct();
                    break;
                case 2:
                    addToBasket(client);
                    break;
                case 3:
                    displayBasket(client);
                    break;
                case 4:
                    removeFromBasket(client);
                    break;
                case 5:
                    editQuantityinBasket(client);
                    break;
                case 6:
                    placeAnOrder(client);
                    break;
                case 7:
                    displayOrdersHistory(client);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова");
            }
        }
    }

    private void displayProduct() {
        List<Product> products = productService.getAllProducts();
        System.out.println("Список всех товаров: ");
        for (Product product : products) {
            System.out.println(product.getId() + ". " + product.getName() + " " +
                    product.getPrice() + " Всего на складе: " + product.getQuantityStock());
        }
    }

    private void addProduct() {
        System.out.println("Введите название товара");
        String name = menu.getStringInput();
        System.out.println("Введите цену товара");
        double price = menu.getDoubleInput();
        System.out.println("Введите количество");
        int quantity = menu.getUserInput();
        Product product = new Product(productService.getAllProducts().size() + 1, name, price, quantity);
        productService.addProduct(product);
        System.out.println("Товар успешно добавлен");
    }

    private void removeProduct() {
        System.out.println("Введите Id товара, который хотите удалить");
        int id = menu.getUserInput();
        productService.removeProduct(id);
        System.out.println("Товар успешно удален");
    }

    private void editProduct() {
        System.out.println("Введите Id товара, который хотите изменить");
        int id = menu.getUserInput();
        System.out.println("Введите новое название товара");
        String newName = menu.getStringInput();
        System.out.println("Введите новую цену товара");
        double newPrice = menu.getDoubleInput();
        System.out.println("Введите новое количество товара");
        int newQuantity = menu.getUserInput();
        productService.editProduct(id, newName, newPrice, newQuantity);
        System.out.println("Товар успешно изменен");
    }

    private void addToBasket(Client client) {
        System.out.println("введите id товара");
        int id = menu.getUserInput();
        System.out.println("введите количество");
        int quantity = menu.getUserInput();
        List<Product> products = productService.getAllProducts();
        Product product = null;
        for (Product p : products) {
            if (p.getId() == id) {
                product = p;
                break;
            }
        }
        if (product == null) {
            System.out.println("товар с таким id не найден");
            return;
        }
        basketService.addToBasket(client, product, quantity);
        System.out.println("Товар добавлен в корзину");
    }

    private void removeFromBasket(Client client) {
        List<Basket> basketList = basketService.getBasket(client);
        if (basketList.isEmpty()) {
            System.out.println("Ваша корзина пуста");
            return;
        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < basketList.size(); i++) {
            Basket element = basketList.get(i);
            System.out.println(i + 1 + "." + element.getProduct().getName() + " - количество:" + element.getQuantity());
        }
        System.out.println("Выберите товар для удаления");
        int choice = menu.getUserInput();
        if (choice < 1 || choice > basketList.size()) {
            System.out.println("Неверный выбор");
            return;
        }
        Basket basket = basketList.get(choice - 1);
        Product product = basket.getProduct();
        int quantity = basket.getQuantity();
        product.setQuantityStock(product.getQuantityStock() + quantity);
        basketService.removeFromBasket(client, product);
        System.out.println("Товар успешно удален из корзины");
    }

    private void editQuantityinBasket(Client client) {
        List<Basket> basketList = basketService.getBasket(client);
        if (basketList.isEmpty()) {
            System.out.println("Ваша корзина пуста");
            return;
        }
        System.out.println("Ваша корзина:");
        for (int i = 0; i < basketList.size(); i++) {
            Basket element = basketList.get(i);
            System.out.println(i + 1 + "." + element.getProduct().getName() + " - количество:" + element.getQuantity() +
                    "(на складе: " + element.getProduct().getQuantityStock() + ")");
        }
        System.out.println("Выберите номер товара для изменения количества");
        int choice = menu.getUserInput();
        if (choice < 1 || choice > basketList.size()) {
            System.out.println("Неверный выбор");
            return;
        }
        Basket basket = basketList.get(choice - 1);
        Product product = basket.getProduct();
        System.out.println("Текущее количество" + basket.getQuantity());
        System.out.println("Введите новое количество");
        int newQuantity = menu.getUserInput();
        if (newQuantity <= 0) {
            System.out.println("Количество должно быть больше нуля");
            return;
        }
        if (newQuantity > product.getQuantityStock() + basket.getQuantity()) {
            System.out.println("Недостаточно товара на складе");
            return;
        }
        product.setQuantityStock(product.getQuantityStock() + basket.getQuantity());
        basket.setQuantity(newQuantity);
        product.setQuantityStock(product.getQuantityStock() - newQuantity);
        System.out.println("Количество обновлено");

    }

    private void displayBasket(Client client) {
        List<Basket> basketList = basketService.getBasket(client);
        System.out.println("ВАША корзина: ");
        double totalBasket = 0;
        for (Basket basket : basketList) {
            System.out.println(basket.getProduct().getName() + ", цена - " + basket.getProduct().getPrice() + ", количество - " +
                    basket.getQuantity());
            totalBasket = totalBasket + basket.getProduct().getPrice() * basket.getQuantity();
        }
        System.out.println("Итоговая стоимость равна " + totalBasket);
    }

    private void displayOrdersHistory(Client client) {
        Map<Integer, Order> orders = client.getOrders();
        if (orders.isEmpty()) {
            System.out.println("Заказов нет");
            return;
        }
        System.out.println("История заказов:1");
        for (Order order : orders.values()) {
            System.out.println("Заказ №:" + order.getIdOrder() + ", сумма: " + order.getTotalSum());
            for (Basket b : order.getBasketList()) {
                System.out.println(b.getProduct().getName() + " - " + b.getQuantity() + "шт.");
            }
        }
    }

    private void placeAnOrder(Client client) {
        List<Basket> basketList = basketService.getBasket(client);
        if (basketList.isEmpty()) {
            System.out.println("корзина пуста");
            return;
        }
        Order order = orderService.createOrder(client, basketList);
        System.out.println("Заказ оформлен, номер заказа " + order.getIdOrder());
        basketList.clear();
    }

    private void saveAndExit() {
        fileRepository.saveUsers(authorizationService.getUsers());
        fileRepository.saveProducts(productService.getAllProducts());
        fileRepository.saveOrders(orderService.getOrders());
        System.out.println("Данные сохранены");
    }
}
