public class Ticket {


    // Attributes of Ticket class
    int pnrNumber;
    String departureLocation;
    String destinationLocation;
    String departureDate;
    String departureTime;
    int seatNumber;
    float ticketPrice;
    boolean isCancelled = false;
    Passenger passengerDetails;
    Flight flightDetails;


    // Constructor for Ticket class

    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String departureDate, String departureTime, int seatNumber, float ticketPrice, boolean isCancelled, Passenger passengerDetails, Flight flightDetails) {
        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.isCancelled = isCancelled;
        this.passengerDetails = passengerDetails;
        this.flightDetails = flightDetails;
    }


    // Methods for Ticket class


    //Check the status of flight
    public String checkFlightStatus(Flight flight){
        return "";
    }


    // Check the duration of flight
    public String checkFlightDuration(Flight flight){
        return "";
    }


    // Cancel ticket
    public void cancelFlightTicket(){
        this.isCancelled = true;
    }
}
