package HomeWorkEleven_taskThree;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Product telephone = new Product(1,"Телефон", 1800.99);
        Product laptop = new Product(2, "Ноутбук", 2025.00);
        Product tv = new Product(3,"Телевизор", 1780.99);
        Product headphones = new Product(4, "Наушники", 240.99);
        catalog.addProduct(telephone);
        catalog.addProduct(laptop);
        catalog.addProduct(tv);
        catalog.addProduct(headphones);
        System.out.println( "Самый дорогой товар в каталоге: "+ catalog.getMostExpensive());
        catalog.printAllProducts();
        catalog.clearCatalog();
        catalog.printAllProducts();

    }
}
