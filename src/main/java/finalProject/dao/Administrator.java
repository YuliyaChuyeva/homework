package finalProject.dao;

public class Administrator extends User {
    private String name;

    public Administrator(String login, String password, String name) {
        super(login, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}