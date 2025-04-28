package homeWorkNine_taskTwo;

public abstract class Vehicle {
    protected String name;
    protected int currentSpeed;
    protected int maxSpeed;

    public Vehicle(String name, int currentSpeed, int maxSpeed) {
        this.name = name;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
    }

    public void move() {
        if (currentSpeed == 0) {
            currentSpeed = maxSpeed / 2;
        }
        System.out.println(name + ": Движение со скоростью " + currentSpeed + " км/ч.");
    }

    public void startEngine() {
        System.out.println("Двигатель " + name + " включен");
    }

    public void stopEngine() {
        System.out.println("Двигатель " + name + " выключен");
    }

    public abstract double calculateFuelConsumption();

    public void showInfo() {
        System.out.println("Транспортное средство: " + name + ", Максимальная скорость: " + maxSpeed + " км/ч");
    }
}
