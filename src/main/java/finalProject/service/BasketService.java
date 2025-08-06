package finalProject.service;

import finalProject.dao.Basket;
import finalProject.dao.Client;
import finalProject.dao.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BasketService {
    private Map<Client, List<Basket>> basket;

    public BasketService() {
        this.basket = new HashMap<>();
    }

    public void addToBasket(Client client, Product product, int quantity) {
        List<Basket> basketList = basket.computeIfAbsent(client, k -> new ArrayList<>());
        for (Basket basket1 : basketList) {
            if (basket1.getProduct().getId() == product.getId()) {
                basket1.setQuantity(basket1.getQuantity() + quantity);
                product.setQuantityStock(product.getQuantityStock() - quantity);
                return;
            }
        }
        if (product.getQuantityStock() < quantity) {
            System.out.println("Не хватает товара на складе");
            return;
        }
        basketList.add(new Basket(product, quantity));
        product.setQuantityStock(product.getQuantityStock() - quantity);
    }

    public void removeFromBasket(Client client, Product product) {
        List<Basket> basketList = basket.get(client);
        if (basketList != null) {
            basketList.removeIf(item -> item.getProduct().getId() == product.getId());
        }
    }

    public List<Basket> getBasket(Client client) {
        return basket.getOrDefault(client, new ArrayList<>());
    }
}
