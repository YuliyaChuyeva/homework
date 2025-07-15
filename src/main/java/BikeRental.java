import java.awt.*;

public class BikeRental {
    private String bikeType;
    private double hourlyRate;
    private boolean availability;
    private String renterName;

    public BikeRental(String bikeType, double hourlyRate, boolean availability) {
        setBikeType(bikeType);
        setHourlyRate(hourlyRate);
        this.availability = availability;
        this.renterName = null;
    }

    public BikeRental(String bikeType) {
        setBikeType(bikeType);
        this.hourlyRate = 5.0;
        this.availability = true;
        this.renterName = null;

    }

    public String getBikeType() {
        return bikeType;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public boolean isAvailability() {
        return availability;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setBikeType(String bikeType) {
        if (bikeType.equals("Road") || bikeType.equals("Electric") || bikeType.equals("Mountain")) {
            this.bikeType = bikeType;
        } else {
            System.out.println("Invalid bikeTypes");
        }
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate >= 0) {
            this.hourlyRate = hourlyRate;
        } else {
            System.out.println("Invalid HourlyRate");
        }
    }

    public void rentBike(String name) {
        if (!availability) {
            System.out.println("Sorry, this bike is currently unavailable.");
        } else {
            availability = false;
            renterName = name;
            System.out.println("Bike rented successfully to" + renterName);
        }
    }

    public void returnBike() {
        if (renterName == null) {
            System.out.println("Bike is already free");
        } else {
            availability = true;
            renterName = null;
            System.out.println("Bike returned successfully.");
        }
    }

    public static void main(String[] args) {
        BikeRental bikeRental1 = new BikeRental("Mountain", 10.0, true);
        BikeRental bikeRental2 = new BikeRental("Electric", 15.0, true);
        BikeRental bikeRental3 = new BikeRental("Road");
        bikeRental1.rentBike("John");
        bikeRental1.rentBike("Alice");
        bikeRental1.returnBike();
        bikeRental1.rentBike("Alice");
    }
}
