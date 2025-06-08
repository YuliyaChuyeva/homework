package homeWorkTwenty;

import java.io.*;
import java.util.ArrayList;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SerializationEx {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        list.add(new Product("Телефон", 2000.13));
        list.add(new Product("Телевизор", 4000.99));
        list.add(new Product("Наушники", 300.00));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("product.ser"))) {
            objectOutputStream.writeObject(list);
            System.out.println("Сериализация прошла успешно!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("product.ser"))) {
            ArrayList<Product> productArrayList = (ArrayList<Product>) objectInputStream.readObject();
            for (Product product : productArrayList) {
                System.out.println(product);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
