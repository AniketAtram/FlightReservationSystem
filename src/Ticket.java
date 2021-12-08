public abstract class Ticket {


    // TODO: Add attributes
    private int pnrNumber; // A unique identification number for each ticket booked by passenger

    private String departureLocation; // Location from where the passenger is boarding

    private String destinationLocation; // Location where the passenger is travelling

    private String departureDate; // Date for which the flight is booked

    private String departureTime; // Time when the flight leaves from departure location

    private int seatNumber; // Seat number of the passenger

    private float ticketPrice; // Amount paid by the passenger

    private boolean isCancelled = false; // Weather the passenger has cancelled ticket or not

    Passenger passengerDetails; // Aggregate relationship between Ticket and Passenger

    Flight flightDetails; // Aggregate relationship between Flight and Passenger


    // TODO: Create a constructor


    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String departureDate,
                  String departureTime, int seatNumber, float ticketPrice, boolean isCancelled,
                  Passenger passengerDetails, Flight flightDetails) {

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

    } // End of constructor for Ticket class


    // TODO: Create methods


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
