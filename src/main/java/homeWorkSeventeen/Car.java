package homeWorkSeventeen;

import java.util.Objects;

public class Car {
    private int id;
    private String brand;
    private double price;

    public Car(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        Car car1 = new Car(1, "Mersedes S63 AMG", 137900.50);
        Car car2 = new Car(1, "Tesla", 85700.10);
        Car car3 = new Car(2, "Audi Q8", 67830.20);
        System.out.println(car1.equals(car2));
        System.out.println(car1.equals(car3));
    }
}
