package homeWorkTwenty;

public enum CoffeeType {
    ESPRESSO("ESPRESSO", "Маленький,60 мл", 100),
    CAPPUCCINO("CAPPUCCINO", "Средний,150 мл", 200),
    LATTE("LATTE", "Большой,250 мл", 150);

    private String name;
    private String description;
    private int price;

    CoffeeType(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getPrice() {
        return price;
    }
}

