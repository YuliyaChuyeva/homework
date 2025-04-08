public class Car {
    // fuelLevel (уровень топлива, число типа double).

    String brand;
    String model;
    double mileage;
    double fuelLevel;

    public Car(String brand, String model, double mileage, double fuelLevel) {
        this.brand = brand;
        this.model = model;
        this.mileage = mileage;
        this.fuelLevel = fuelLevel;
    }

    public Car(String brand, String model) {
        this(brand, model, 0.0, 50.0);
    }

    public void drive(double distance) {
        mileage = mileage + distance;
        fuelLevel = fuelLevel - (distance * 0.1);
        if (fuelLevel <= 0) {
            System.out.println("Not enough fuel!");
        }
    }

    public void refuel(double fuelAmount) {
        fuelLevel = fuelLevel + fuelAmount;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 20000, 80);
        Car car2 = new Car("Toyota", "Corolla");
        car1.drive(300);
        car2.refuel(10);
        car2.drive(500);
        System.out.println(car1.brand + ": пробег " + car1.mileage + ",уровень топлива " + car1.fuelLevel);
        System.out.println(car2.brand + ": пробег " + car2.mileage + ",уровень топлива " + car2.fuelLevel);
    }
}
