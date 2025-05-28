package homeWorkSeventeen;

public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Check {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age <= 18) {
            throw new InvalidAgeException("Возраст меньше 18.");
        } else {
            System.out.println("Возраст больше 18.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(5);
        } catch (InvalidAgeException e) {
            System.out.println("Выброшено исключение - " + e.getMessage());
        }
    }
}
