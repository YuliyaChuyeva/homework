package HomeWorkEleven_taskThree;

import java.util.ArrayList;

public class ProductCatalog {
    ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(id);
                System.out.println("Товар удален" + id);
            } else {
                System.out.println("Товара с таким id нет");
            }
        }
    }

    public Product getMostExpensive(){
        Product mostExpensive= products.get(0);
        for (Product product:products){
            if (product.getPrice()>mostExpensive.getPrice()){
                mostExpensive=product;
            }
        }
        return mostExpensive;
    }

    public void printAllProducts(){
        if(products.isEmpty()){
            System.out.println("Каталог пуст.");
        }
        for (Product product: products){
            System.out.println(product);
        }
    }

    public void clearCatalog(){
        products.clear();
    }
}
