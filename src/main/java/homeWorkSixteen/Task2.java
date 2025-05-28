package homeWorkSixteen;

public class Task2 {
    private static int maxObjects;
    private static int currentObjects;

    static {
        maxObjects = 2;
    }

    public Task2() {
        if (currentObjects != maxObjects) {
            currentObjects++;
        } else {
            System.out.println("Новые объекты создавать нельзя!");
        }
    }

    public static void main(String[] args) {
        Task2 object1 = new Task2();
        Task2 object2 = new Task2();
        Task2 object3 = new Task2();
    }
}
