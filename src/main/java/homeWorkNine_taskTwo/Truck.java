package homeWorkNine_taskTwo;

public class Truck extends Vehicle implements Loadable {

    private int cargoWeight;
    private int maxCargo;

    public Truck(String name, int currentSpeed, int maxSpeed, int maxCargo) {
        super(name, currentSpeed, maxSpeed);
        this.maxCargo = maxCargo;
        this.cargoWeight = 0;
    }

    @Override
    public double calculateFuelConsumption() {
        return 25 + (cargoWeight * 0.1);
    }

    @Override
    public void move() {
        if (cargoWeight > maxCargo) {
            System.out.println(name + ": Грузовик перегружен и он не может двигаться.");
            return;
        }
        super.move();
        System.out.println(name + ": Потребление топлива: " + calculateFuelConsumption() + " л/100км.");
    }


    @Override
    public void loadCargo(int weight) {
        if (cargoWeight + weight > maxCargo) {
            System.out.println(name + ": Превышена грузоподъемность! Груз не загружен.");
        } else {
            cargoWeight += weight;
            System.out.println(String.format("%s: Загружено %d кг. Общий вес груза: %d кг.",
                    name,weight,cargoWeight));
        }
    }

    @Override
    public void unloadCargo() {
        cargoWeight = 0;
        System.out.println(name + ": Груз разгружен.");
    }
}
