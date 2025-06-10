package homeWorkTwenty;

import java.io.*;
import java.util.ArrayList;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String email;
    private transient String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

public class SerializationEx2 {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Alena", "alenaivanova@gmail.com", "12!53Se3"));
        users.add(new User("Irina", "irinawork@gmail.com", "12345689Q!"));
        users.add(new User("Maks", "makspavlov@gmail.com", "1nfu689Q!"));
        users.add(new User("Evgenyi", "genya@gmail.com", "31kcsi89Q!"));
        users.add(new User("Aleks", "aleksbow@gmail.com", "62gsds689Q!"));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            objectOutputStream.writeObject(users);
            System.out.println("Сериализация прошла успешно!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("user.ser"))) {
            ArrayList<User> users2 = (ArrayList<User>) objectInputStream.readObject();
            for (User user : users2) {
                System.out.println(user);
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
