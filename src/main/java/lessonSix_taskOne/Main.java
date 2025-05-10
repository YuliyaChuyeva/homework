package lessonSix_taskOne;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1 = new Car(180, 3);
        Car car2 = new Car(150, 2);
        Truck truck1 = new Truck(150, 500);
        Truck truck2 = new Truck(100, 130);
        car1.startEngine();
        car1.accelerate(60);
        car1.move();
        car2.startEngine();
        car2.accelerate(20);
        car2.move();

        truck1.startEngine();
        truck1.accelerate(15);
        truck1.move();
        truck1.load(300);
        truck1.move();
        truck1.unload();
        truck1.move();

        truck2.startEngine();
        truck2.accelerate(80);
        truck2.move();
        truck2.accelerate(40);
    }
}
