package finalProject.dao;

import java.util.HashMap;
import java.util.Map;

public class Client extends User {
    private String name;
    Map<Integer, Order> orders;

    public Client(String login, String password, String name) {
        super(login, password);
        this.name = name;
        this.orders = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.put(order.getIdOrder(), order);
    }
}