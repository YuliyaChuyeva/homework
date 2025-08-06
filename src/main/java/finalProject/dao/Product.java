package finalProject.dao;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantityStock;

    public Product(int id, String name, double price, int quantityStock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
}
