public class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int seatNumber;
    private boolean isAvailable;

    public MovieTicket(String movieName, double ticketPrice, int seatNumber, boolean isAvailable) {
        this.movieName = movieName;
        setTicketPrice(ticketPrice);
        setSeatNumber(seatNumber);
        this.isAvailable = isAvailable;
    }

    public MovieTicket(String movieName, double ticketPrice) {
        this.movieName = movieName;
        setTicketPrice(ticketPrice);
        this.seatNumber = 0;
        this.isAvailable = true;
    }

    public String getMovieName() {
        return movieName;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice > 0) {
            this.ticketPrice = ticketPrice;
        } else {
            System.out.println("Invalid ticketPrice");
        }
    }

    public void setSeatNumber(int seatNumber) {
        if (seatNumber > 0) {
            this.seatNumber = seatNumber;
        } else {
            System.out.println("Invalid seatNumber");
        }
    }

    public void sellTicket(String buyerName) {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Ticket for " + movieName + ",seat " + seatNumber + " sold to " + buyerName +".");
        } else {
            System.out.println("Ticket for " + movieName + ",seat " + seatNumber + " is not available.");
        }
    }


    public void returnTicket() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Ticket for " + movieName + ",seat " + seatNumber + " is now available.");
        } else {
            System.out.println("Ticket for " + movieName + ",seat " + seatNumber + " is already available.");
        }
    }

    public static void main(String[] args) {
        MovieTicket inception = new MovieTicket("Inception", 10.0,5,true);
        MovieTicket avengers = new MovieTicket("Avengers", 15.0,3,true);
        inception.sellTicket("John");
        inception.sellTicket("Mary");
        inception.returnTicket();
        inception.sellTicket("Mary");
    }


}
