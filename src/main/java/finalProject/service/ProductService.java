package finalProject.service;

import finalProject.dao.Product;

import java.util.List;

public class ProductService {
    private List<Product> productList;

    public ProductService(List<Product> productList) {
        this.productList = productList;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(int productId) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                productList.remove(product);
                return;
            }
        }
    }

    public void editProduct(int productId, String newName, double newPrice, int newQuantityStock) {
        for (Product product : productList) {
            if (product.getId() == productId) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantityStock(newQuantityStock);
                return;
            }
        }
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}
