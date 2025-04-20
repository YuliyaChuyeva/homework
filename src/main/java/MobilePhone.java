public class MobilePhone {
    private String brand;
    private String model;
    private int batteryLevel;
    private String contact1;
    private String contact2;

    public MobilePhone(String brand, String model, int batteryLevel, String contact1, String contact2) {
        this.brand = brand;
        this.model = model;
        setBatteryLevel(batteryLevel);
        setContact1(contact1);
        setContact2(contact2);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public String getContact1() {
        return contact1;
    }

    public String getContact2() {
        return contact2;
    }

    public void setBatteryLevel(int batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Invalid batteryLevel");
        }
    }

    public void setContact1(String contact1) {
        if (contact1 != null &&!contact1.isEmpty()) {
            this.contact1 = contact1;
        } else {
            System.out.println("Contact1=null");
        }
    }

    public void setContact2(String contact2) {
        if (contact2 != null && !contact2.isEmpty()) {
            this.contact2 = contact2;
        } else {
            System.out.println("Contact2=null");
        }
    }

    public void callContact(String name) {
        if (batteryLevel <= 10) {
            System.out.println("Battery low");
        } else if (batteryLevel >= 10 && batteryLevel <= 100) {
            if (name.equals(contact1) || name.equals(contact2)) {
                System.out.println("Calling " + name);
                batteryLevel = batteryLevel - 10;
            } else {
                System.out.println("contact not found");
            }
        }
    }

    public String toString() {
        return "MobilePhone{brand='" + brand + "', model='" + model + "', batteryLevel=" + batteryLevel +
                ", contact1='" + contact1 + "', contact2='" + contact2 + "'}";
    }


    public static void main(String[] args) {
        MobilePhone iphone = new MobilePhone("Iphone", "12", 80, "Alice", "Bob");
        MobilePhone samsung = new MobilePhone("Samsung", "Galaxy S21", 15, "Tim", "Alan");
        iphone.callContact("Alice");
        iphone.callContact("Tim");
        samsung.callContact("Tim");
        samsung.callContact("Alan");
        System.out.println(iphone.toString());
        System.out.println(samsung.toString());

    }


}
