import org.w3c.dom.ls.LSOutput;

public class User {
    private String userName;
    private String password;
    private String email;
    private boolean isAdmin;

    public User(String userName,String password,String email,boolean isAdmin){
        setUserName(userName);
        this.password=password;
        setEmail(email);
        this.isAdmin=isAdmin;
    }
    public String getUserName(){
        return userName;
    }

    public String getPassword(){
        return  password;
    }

    public String getEmail(){
        return email;
    }
    public boolean isAdmin(){
        return isAdmin;
    }
    public void setUserName(String userName){
        if (userName!= null&&userName.length()<=15&&userName.length()>=5){
        this.userName=userName;}
        else {
            System.out.println("Invalid name");
        }
    }
    public void setEmail(String email){
        if (email!=null&&email.contains("@")){
            this.email=email;
        }
        else {
            System.out.println("invalid email");
        }
    }
    public boolean changePassword(String oldPassword,String newPassword){
        if(this.password.equals(oldPassword)){
            if(newPassword.length()>=8){
                this.password = newPassword;
                return true;
            }
            else {
                System.out.println("length newPassword <8");
            }
        }
        else {
            System.out.println("oldpassword!=password");
        }
        return  false;
    }

    public String toString(){
        return "User{username=" + userName +", " +  " email: " + email + ", "+ " isAdmin=" + isAdmin+ "}";

    }

    public static void main(String[] args) {
        User user1 = new User("JohnDoe","1234abcd","john.doe@example.com",false);
        User user2 = new User("Admin123","Admin123","admin@example.com",true);
        System.out.println(user1.toString());
        System.out.println(user2.toString());
    }

}
