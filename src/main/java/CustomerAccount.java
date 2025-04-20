public class CustomerAccount {
    private String name;
    private String email;
    private double balance;
    private int discount;
    private String accountStatus;

    public CustomerAccount(String name, String email, double balance, int discount, String accountStatus) {
        setName(name);
        setEmail(email);
        setBalance(balance);
        setDiscount(discount);
        setAccountStatus(accountStatus);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public int getDiscount() {
        return discount;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setName(String name) {
        if (name != null&& !name.isEmpty() ) {
            this.name = name;
        } else {
            System.out.println("Name =null");
        }
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email");
        }
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance <0");
        }
    }

    public void setDiscount(int discount) {
        if (discount >= 0 && discount <= 50) {
            this.discount = discount;
        } else {
            System.out.println("Balance должен быть от 0 до 50%");
        }
    }

    public void setAccountStatus(String accountStatus) {
        if (accountStatus.equals("Active") || accountStatus.equals("Blocked")) {
            this.accountStatus = accountStatus;
        } else {
            System.out.println("AccountStatus invalid");
        }
    }

    public void purchase(double amount) {
        if (accountStatus.equals("Blocked")) {
            System.out.println("Account is blocked. Purchase denied.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else if (amount < balance) {
            balance = balance - amount - (amount * discount / 100);
            System.out.println(balance);
        }
    }

    public void applyDiscount(int value) {
        if (accountStatus.equals("Blocked")) {
            System.out.println("Cannot apply discount. Account is blocked.");
        }
        else  if (value>=0 &&value<=50){
            discount=value;
            System.out.println("Discount applied successfully.");
        }
        else {
            System.out.println("Invalid discount value.");
        }
    }

    public String toString() {
        return "CustomerAccount{name=" + name + ", email=" + email + ", balance= " + balance + ", discount= " + discount + "%, accountStatus=" + accountStatus + "}";
    }

    public static void main(String[] args) {
        CustomerAccount john= new CustomerAccount("John Doe","john@example.com", 200.0, 10,"Active");
        CustomerAccount mary = new CustomerAccount("Mary Smith","mary@example.com", 50.0,  0, "Blocked");
        john.purchase(50.0);
        System.out.println(john);
        mary.applyDiscount(20);
        mary.purchase(30);
        System.out.println(mary);

    }
}

