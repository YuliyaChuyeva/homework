package homeWorkTwenty;

public enum CoffeeType {
    ESPRESSO("Маленький,60 мл", 100),
    CAPPUCCINO("Средний,150 мл", 200),
    LATTE("Большой,250 мл", 150);

    private String description;
    private int price;

    CoffeeType(String description, int price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}

