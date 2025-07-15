package homeworkSeven_taskTwo;

public class Main {

    public static void main(String[] args) {
        Lion lion = new Lion("Miron", "Lion", 5, "meat");
        Penguin penguin=new Penguin("Tim", "Penguin",3,"fish");
        Elephant elephant = new Elephant("Dumbo", "Elephant", 13,"grass");

        Zookeeper zookeeper = new Zookeeper( lion);
        zookeeper.checkStatus();
        zookeeper.walkAnimal();
        zookeeper.feedAnimal("meat");
        zookeeper.feedAnimal("meat");
        zookeeper.feedAnimal("meat");
        zookeeper.letAnimalSleep();
        zookeeper.checkStatus();
        zookeeper.setAnimal(penguin);
        zookeeper.checkStatus();
        zookeeper.walkAnimal();
        zookeeper.feedAnimal("fish");
        zookeeper.letAnimalSleep();
        zookeeper.checkStatus();
        zookeeper.setAnimal(elephant);
        zookeeper.checkStatus();
        zookeeper.walkAnimal();
        zookeeper.feedAnimal("grass");
        zookeeper.letAnimalSleep();
        zookeeper.checkStatus();
    }
}
