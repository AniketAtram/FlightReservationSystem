public class TouristTicket extends Ticket{


    // TODO: Add attributes
    private String hotelAddress; // The address where the passenger is staying
    private String[] selectedLocations; // Tourist locations selected by the passenger


    // TODO : Add a constructor


   public TouristTicket(int pnrNumber, String departureLocation, String destinationLocation,
                        String departureDate, String departureTime, int seatNumber, float ticketPrice,
                        boolean isCancelled, Passenger passengerDetails, Flight flightDetails, String hotelAddress,
                        String[] selectedLocations){


       // Calling constructor from Ticket class
       super(pnrNumber, departureLocation, destinationLocation, departureDate, departureTime, seatNumber,
               ticketPrice, isCancelled, passengerDetails, flightDetails);


       this.hotelAddress = hotelAddress; // Initializing the hotel address
       this.selectedLocations = selectedLocations; // Initializing selectedLocations array


   }// End of TouristTicket constructor


    // TODO : Add methods



} // End of TouristTicket class