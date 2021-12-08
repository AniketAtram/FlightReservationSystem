import java.lang.reflect.Array;
import java.util.*;

public class TouristTicket extends Ticket{

    // TODO: Add attributes
    private String hotelAddress; // The address where the passenger is staying
    private ArrayList<String> selectedLocations; // Tourist locations selected by the passenger


    // TODO : Add a constructor
   public TouristTicket(int pnrNumber, String departureLocation, String destinationLocation,
                        String departureDate, String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice,
                        Passenger passengerDetails, Flight flightDetails, String hotelAddress,
                        ArrayList<String> selectedLocations){


       // Calling constructor from Ticket class
       super(pnrNumber, departureLocation, destinationLocation, departureDate, departureTime, destinationArrivalTime,seatNumber,
               ticketPrice, passengerDetails, flightDetails);


       this.hotelAddress = hotelAddress; // Initializing the hotel address
       this.selectedLocations = selectedLocations; // Initializing selectedLocations array


   }// End of TouristTicket constructor


    // TODO : Add methods
    // Remove location from array
    public void removeLocation(String locationToBeRemoved){
        selectedLocations.remove(locationToBeRemoved);

    }


    //TODO: Getters and setters


    public ArrayList<String> getSelectedLocations() {
        return this.selectedLocations;
    }
} // End of TouristTicket class