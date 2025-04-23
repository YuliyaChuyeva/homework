package homeworkEight_taskOne;

public class Product {
    public static int totalProducts = 0;
    public static int totalStock = 0;
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        totalProducts++;
        totalStock += stock;
    }

    public void getInfo() {
        System.out.println(String.format("Продукт %s стоит %.2f.Количество товаров на складе %d.", name, price, stock));
    }

    public void sellProduct(int quantity) {
        if (quantity > stock) {
            System.out.println("Такого количества нет на складе");
        } else {
            stock -= -quantity;
            totalStock -= quantity;
            System.out.println("Продано " + quantity + " шт." + name);
            double percentProduct = ((double) stock / (stock + quantity)) * 100;
            System.out.println(String.format("Осталось %.2f %% товара %s на складе.", percentProduct, name));
        }
    }

    public static void showStatistics() {
        System.out.println("Общая статистика:");
        System.out.println(String.format("Всего продуктов %d", totalProducts));
        System.out.println(String.format("Общее остаток товаров на складе %d", totalStock));
    }

    public static void showAverageStock() {
        if (totalProducts == 0) {
            System.out.println("Нет данных для расчета среднего остатка");
        } else {
            double average = (double) totalStock / totalProducts;
            average = Math.round(average * 100.0) / 100.0;
            System.out.println("Средний остаток товаров на складе:" + average);
        }
    }
}
    class Main {
        public static void main(String[] args) {
            Product product1 = new Product("Milk", 7.2, 23);
            Product product2 = new Product("Bread", 2.2, 42);
            Product product3 = new Product("Cake", 10.2, 11);

            product1.getInfo();
            product2.getInfo();
            product3.getInfo();

            product1.sellProduct(1);
            product2.sellProduct(12);
            product3.sellProduct(13);

            Product.showStatistics();
            Product.showAverageStock();

        }
    }

