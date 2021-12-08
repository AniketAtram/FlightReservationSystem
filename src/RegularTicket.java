public class RegularTicket extends Ticket{


    // TODO : Add attributes
    private String[] servicesRequested; // Services such as food , water, etc. availed by passenger


    // TODO : Add constructor

    public RegularTicket(int pnrNumber, String departureLocation, String destinationLocation, String departureDate,
                         String departureTime, int seatNumber, float ticketPrice, boolean isCancelled,
                         Passenger passengerDetails, Flight flightDetails, String[] servicesRequested){


        // Calling the constructor from Ticket class
        super(pnrNumber, departureLocation,destinationLocation,departureDate, departureTime, seatNumber,
                ticketPrice, isCancelled, passengerDetails, flightDetails);


        this.servicesRequested = servicesRequested; // initializing the servicesRequested attribute


    }// End of RegularTicket constructor


    // TODO : Add methods


    // TODO : Add getters and setters


}