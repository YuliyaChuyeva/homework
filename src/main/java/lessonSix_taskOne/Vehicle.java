package lessonSix_taskOne;

import java.io.IOException;

public abstract class Vehicle {
    protected int speed;
    protected double fuel; // количество топлива в литрах
    protected final int maxSpeed;

    public Vehicle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.speed = 0;
        this.fuel = 50;
    }

    public void startEngine() {
        System.out.println("Двигатель включен");
    }

    //ускорение
    public final void accelerate(int increase) throws Exception {

        if (speed + increase > maxSpeed) {
            throw new Exception("Превышение скорости");
        }
        speed = speed + increase;
        System.out.println("Ускорение: текущая скорость = " + speed + " км/ч");
    }

    public abstract void move();


}
