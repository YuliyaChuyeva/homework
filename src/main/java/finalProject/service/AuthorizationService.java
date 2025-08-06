package finalProject.service;

import finalProject.dao.User;

import java.util.Map;

public class AuthorizationService {
    private Map<String, User> users;

    public AuthorizationService(Map<String, User> users) {
        this.users = users;
    }

    public User login(String login, String password) {
        User user = users.get(login);
        if (user == null || !user.getPassword().equals(password)) {
            System.out.println("Неверный  пароль или логин");
            return null;
        }
        return user;
    }

    public void register(User user) {
        users.put(user.getLogin(), user);
    }

    public Map<String, User> getUsers() {
        return users;
    }
}
