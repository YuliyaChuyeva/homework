package lessonSix_taskThree;

class SmartThermostat extends SmartDevice{
    private int currentTemperature;
    private int targetTemperature;

    public SmartThermostat(String name,int currentTemperature) {
        super(name);
        this.currentTemperature=currentTemperature;
        this.targetTemperature=currentTemperature;
    }

    public void setTargetTemperature(int temperature) {
        this.targetTemperature = temperature;
        System.out.println(name + ": Целевая температура установлена на " + targetTemperature + " градусов.");
    }

    @Override
    public void performAction() {
        if (isOn) {
            System.out.println(name + ": Настройка температуры с " + currentTemperature + " градусов до " + targetTemperature + " градусов.");
            currentTemperature = targetTemperature;
        } else {
            System.out.println(name + " выключено. Невозможно выполнить действие.");
        }
    }
}
