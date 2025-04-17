package lessonSix_taskThree;

class SmartSpeaker extends SmartDevice {

    private String currentSong;

    public SmartSpeaker(String name) {
        super(name);
        this.currentSong = "Нет музыки";
    }

    public void playMusicSong(String song) {
        if (!isOn) {
            System.out.println("Включите устройство " + name + " для проигрывания музыки.");
            return;
        }
        currentSong = song;
        System.out.println(name + ": Воспроизведение музыки — " + currentSong);
    }

    @Override
    public void performAction() {
        if (!isOn) {
            System.out.println("Включите устройство для проигрывания музыки");
        } else {
            System.out.println("Играет музыка " + currentSong);
        }
    }
}
