package lessonSix_taskThree;

public abstract class SmartDevice {
    protected String name;
    protected boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void turnOn() {
         isOn = true;
        System.out.println(name +" включено");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(name+ " выключено");
    }

    public abstract void performAction();
}
