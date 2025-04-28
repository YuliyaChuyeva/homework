package homeWorkNine_taskTwo;

public class Car extends Vehicle {
    private int volumeFuelBak;
    private int fuelLevel;

    public Car(String name, int currentSpeed, int maxSpeed, int volumeFuelBak) {
        super(name, currentSpeed, maxSpeed);
        this.volumeFuelBak = volumeFuelBak;
        this.fuelLevel = volumeFuelBak;
    }

    @Override
    public double calculateFuelConsumption() {
        return 5.9;
    }

    @Override
    public void move() {
        if (fuelLevel <= 0) {
            System.out.println(name + ": Недостаточно топлива для движения!");
            return;
        }
        super.move();
        fuelLevel -= calculateFuelConsumption() * (currentSpeed / 100.0);
        System.out.println(String.format("%s: Осталось топлива: %d",name,fuelLevel ));
    }

    public void refuel(double litrs) {
        if (fuelLevel + litrs > volumeFuelBak) {
            fuelLevel = volumeFuelBak;
            System.out.println(name + ": Бак полностью заправлен.");
        } else {
            fuelLevel += litrs;
            System.out.println(String.format("%s : Заправлено %.2f л. Текущий уровень топлива: %d л.",
                    name,litrs,fuelLevel));
        }
    }
}
