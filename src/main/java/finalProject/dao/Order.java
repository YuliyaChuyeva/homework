package finalProject.dao;

import java.util.List;

public class Order {
    private int idOrder;
    private List<Basket> basketList;
    private double totalSum;

    public Order(int idOrder, List<Basket> basketList, double totalSum) {
        this.idOrder = idOrder;
        this.basketList = basketList;
        this.totalSum = totalSum;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public List<Basket> getBasketList() {
        return basketList;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(double totalSum) {
        this.totalSum = totalSum;
    }
}
