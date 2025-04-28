package homeWorkNine_taskTwo;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("Mersedes",110,180,80);
        Truck truck=new Truck("Shacman",90,120,800);
        ElectricCar electricCar = new ElectricCar("Tesla",130,200,100);
        car.showInfo();
        car.startEngine();
        car.move();
        car.refuel(3);
        car.stopEngine();
        truck.showInfo();
        truck.startEngine();
        truck.move();
        truck.loadCargo(430);
        truck.move();
        truck.unloadCargo();
        truck.stopEngine();
        electricCar.showInfo();
        electricCar.startEngine();
        electricCar.move();
        electricCar.recharge();
        electricCar.checkBatteryStatus();
        electricCar.stopEngine();
    }
}
