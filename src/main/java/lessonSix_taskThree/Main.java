package lessonSix_taskThree;

public class Main {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight("Светильник");
        smartLight.turnOn();
        smartLight.performAction();
        smartLight.adjustBrihtness(45);
        smartLight.turnOff();

        SmartThermostat smartThermostat = new SmartThermostat("Термостат",16);
        smartThermostat.turnOn();
        smartThermostat.setTargetTemperature(21);
        smartThermostat.performAction();
        smartThermostat.turnOff();

        SmartSpeaker smartSpeaker = new SmartSpeaker("Колонка");
        smartSpeaker.turnOn();
        smartSpeaker.playMusicSong("Cry me a river");
        smartSpeaker.performAction();
        smartSpeaker.turnOff();

    }
}
