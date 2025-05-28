package homeWorkSixteen;

public class Task1 {
    private static String systemName;
    private static double version;
    private static int maxUsers;

    static {
        systemName = "Windows";
        version = 11.1;
        maxUsers = 2;
    }

    public static void main(String[] args) {
        System.out.println(String.format("Название системы: %s", systemName));
        System.out.println(String.format("Номер версии: %.2f", version));
        System.out.println(String.format("Максимальное количество пользователей онлайн: %d", maxUsers));
    }
}
