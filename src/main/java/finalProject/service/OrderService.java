package finalProject.service;

import finalProject.dao.Basket;
import finalProject.dao.Client;
import finalProject.dao.Order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderService {
    private int nextOrderId = 1;
    private Map<Client, List<Order>> orders;

    public OrderService(Map<Client, List<Order>> existingOrders) {
        this.orders = existingOrders != null ? existingOrders : new HashMap<>();
        for (List<Order> orderList : orders.values()) {
            for (Order order : orderList) {
                if (order.getIdOrder() >= nextOrderId) {
                    nextOrderId = order.getIdOrder() + 1;
                }
            }
        }
    }

    public OrderService() {
        this(null);
    }

    public double calculateTotalCost(List<Basket> basketList) {
        double total = 0;
        for (Basket basket : basketList) {
            total = total + basket.getProduct().getPrice() * basket.getQuantity();
        }
        return total;
    }

    public Order createOrder(Client client, List<Basket> basketList) {
        List<Basket> basketListCopy = basketList.stream()
                .map(basket -> new Basket(basket.getProduct(), basket.getQuantity()))
                .collect(Collectors.toList());
        double totalCost = calculateTotalCost(basketListCopy);
        Order order = new Order(nextOrderId++, basketListCopy, totalCost);
        client.addOrder(order);
        orders.computeIfAbsent(client, k -> new ArrayList<>()).add(order);
        return order;
    }

    public Map<Client, List<Order>> getOrders() {
        return orders;
    }
}
