package homeWorkTwentyFour.streamsOptional;

import java.util.Optional;

public class OptionalCityEx {
    public static void main(String[] args) {
        User user1 = new User("Julia", new Address("Minsk"));
        User user2 = new User("Kostya", null);
        User user3 = null;
        System.out.println(getCityName(user1));
        System.out.println(getCityName(user2));
        System.out.println(getCityName(user3));
    }

    public static String getCityName(User user) {
        return Optional.ofNullable(user)
                .map(us -> us.address)
                .map(address -> address.city)
                .orElse("Город не указан");
    }
}

class User {
    String name;
    Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

