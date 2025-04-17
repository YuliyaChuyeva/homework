package lessonSix_taskThree;

import java.util.Random;

class SmartLight extends SmartDevice{

    private int brightness;

    public SmartLight(String name){
        super(name);
        this.brightness=50;
    }

    public void adjustBrihtness(int level){
        if(!isOn){
            System.out.println("устройство выключено");
            return;
        }
        else if(level<0||level>100){
                System.out.println("Недопустимое значение яркости: " + level);
                return;
            }
        brightness = level;
        System.out.println(name + ": Яркость установлена на " + brightness);
    }

    @Override
    public void performAction() {
        if (isOn) {
            Random random = new Random();
            System.out.println(brightness = random.nextInt(101));
            System.out.println(name + ": установка яркости на " + brightness + "%.");
        } else {
            System.out.println(name + " выключено");
        }
    }
}
