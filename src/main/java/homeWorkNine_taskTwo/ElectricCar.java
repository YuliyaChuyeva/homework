package homeWorkNine_taskTwo;

public class ElectricCar extends Vehicle implements Rechargeable {
    private int batteryAll;
    private int batteryLevel;

    public ElectricCar(String name, int currentSpeed, int maxSpeed, int batteryAll) {
        super(name, currentSpeed, maxSpeed);
        this.batteryAll = batteryAll;
        this.batteryLevel = batteryAll;
    }

    @Override
    public void recharge() {
        batteryLevel = batteryAll;
        System.out.println(name + ": Батарея полностью заряжена.");
    }

    @Override
    public void checkBatteryStatus() {
        System.out.println(name + ": Текущий уровень заряд батареи: " + batteryLevel + "%.");
    }

    @Override
    public double calculateFuelConsumption() {
        return batteryLevel * 0.5;
    }

    @Override
    public void move() {
        if (batteryLevel <= 0) {
            System.out.println(name + ": Недостаточно заряда для движения!");
            return;
        }
        super.move();
        batteryLevel -= calculateFuelConsumption() * (currentSpeed / 100.0);
        System.out.println(String.format("%s: Осталось заряда: %d %%.",name,batteryLevel ));
    }
}
