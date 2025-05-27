package homeWorkFourteen.taskThree;

public class Dish {
    private int id;
    private String name;
    private double price;

    public Dish(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "ID:" + id + ",Name:" + name + ",Price:" + price;
    }
}
