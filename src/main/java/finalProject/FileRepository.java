package finalProject;

import finalProject.dao.*;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileRepository {
    private static final String USERS_FILE = "src/main/resources/users.txt";
    private static final String ORDERS_FILE = "src/main/resources/orders.txt";
    private static final String PRODUCTS_FILE = "src/main/resources/products.txt";

    public Map<String, User> loadUsers() {
        Map<String, User> users = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(USERS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String type = parts[0];
                String login = parts[1];
                String password = parts[2];
                String name = parts[3];
                User user = "administrator".equals(type) ? new Administrator(login, password, name) : new Client(login, password, name);
                users.put(login, user);
            }
        } catch (IOException | NullPointerException e) {
            System.out.println("Ошибка при загрузке пользователей " + e.getMessage());
        }
        return users;
    }

    public void saveUsers(Map<String, User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USERS_FILE))) {
            for (User user : users.values()) {
                String type = user instanceof Administrator ? "administrator" : "client";
                String name = user instanceof Client
                        ? ((Client) user).getName()
                        : ((Administrator) user).getName();
                writer.write(String.format("%s,%s,%s,%s", type, user.getLogin(), user.getPassword(), name));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> loadProducts() {
        List<Product> products = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(PRODUCTS_FILE));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                int quantityStock = Integer.parseInt(parts[3]);
                products.add(new Product(id, name, price, quantityStock));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return products;
    }

    public void saveProducts(List<Product> products) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(PRODUCTS_FILE))) {
            for (Product product : products) {
                writer.write(String.format("%d,%s,%.2f,%d", product.getId(), product.getName(), product.getPrice(), product.getQuantityStock()));
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<Client, List<Order>> loadOrders(Map<String, User> users, List<Product> allProducts) {
        Map<Client, List<Order>> orders = new HashMap<>();
        Map<Integer, Product> productMap = new HashMap<>();
        for (Product p : allProducts) {
            productMap.put(p.getId(), p);
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(ORDERS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length != 5) continue;
                String login = parts[0];
                int orderId = Integer.parseInt(parts[1]);
                int productId = Integer.parseInt(parts[2]);
                int quantity = Integer.parseInt(parts[3]);
                double priceAtOrder = Double.parseDouble(parts[4]);
                User user = users.get(login);
                if (!(user instanceof Client)) continue;
                Client client = (Client) user;
                Product savedProduct = productMap.get(productId);
                String productName = savedProduct != null ? savedProduct.getName() : "неизвестно";
                Product product = new Product(productId, productName, priceAtOrder, 0);
                Order order = client.getOrders().get(orderId);
                if (order == null) {
                    order = new Order(orderId, new ArrayList<>(), 0.0);
                    client.addOrder(order);
                    orders.computeIfAbsent(client, k -> new ArrayList<>()).add(order);
                }
                Basket basket = new Basket(product, quantity);
                order.getBasketList().add(basket);
                order.setTotalSum(order.getTotalSum() + priceAtOrder * quantity);
            }
        } catch (FileNotFoundException e) {
            System.out.println("orders.txt файл не найден. Будет создан при первом заказе");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении " + e.getMessage());
        }
        return orders;
    }

    public void saveOrders(Map<Client, List<Order>> orders) {
        File file = new File(ORDERS_FILE);
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) {
            System.out.println("папка существует" + parent.getAbsolutePath());
            if (parent.mkdirs()) {
                System.out.println("папка создана");
            } else {
                System.out.println("не удалось создать папку");
                return;
            }
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<Client, List<Order>> entry : orders.entrySet()) {
                Client client = entry.getKey();
                for (Order order : entry.getValue()) {
                    for (Basket basket : order.getBasketList()) {
                        Product p = basket.getProduct();
                        String line = client.getLogin() + "," +
                                order.getIdOrder() + "," +
                                p.getId() + "," +
                                basket.getQuantity() + "," +
                                p.getPrice();
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            writer.flush();
        } catch (IOException e) {
            System.out.println("Ошибка при сохранении orders.txt:");
            System.out.println("Сообщение: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии filewriter");
            }
        }
    }
}

