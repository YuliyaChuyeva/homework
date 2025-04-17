package lessonSix_taskOne;

public class Truck extends Vehicle {
    private double cargoWeight; //текущий вес груза

    public Truck(int maxSpeed, double cargoWeight) {
        super(maxSpeed);
        this.cargoWeight = cargoWeight;
    }

    public void load(double weight) {
        cargoWeight = cargoWeight + weight;
        System.out.println("Груз добавлен. Текущий вес груза: " + cargoWeight + " кг.");
    }

    //метод разгрузки
    public void unload() {
        cargoWeight = 0;
        System.out.println("Грузовик разгружен.");
    }

    @Override
    public void move() {
        if (cargoWeight > 0) {
            if (fuel >= 5) {
                fuel = fuel - 5;
                int distance = speed * 1;
                System.out.println("Грузовик с грузом проехал " + distance + " км. Остаток топлива: " + fuel + " л.");
            } else {
                System.out.println("Недостаточно топлива для движения с грузом!");
            }
        } else {
            if (fuel >= 3) {
                fuel = fuel - 3;
                int distance = speed * 1;
                System.out.println("Грузовик без груза проехал " + distance + " км. Остаток топлива: " + fuel + " л.");
            } else {
                System.out.println("Недостаточно топлива для движения с грузом!");
            }
        }
    }

}