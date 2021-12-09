import java.lang.reflect.Array;
import java.util.*;
// This class is subclass of base class Ticket
public class TouristTicket extends Ticket{

    // TODO: Add attributes
    private String hotelAddress; // The address where the passenger is staying
    private ArrayList<String> selectedLocations; // Tourist locations selected by the passenger


    // TODO : Add a constructor
   public TouristTicket(Passenger passengerDetails, Flight flightDetails, String departureLocation, String destinationLocation,
                        String departureDate, String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice,
                        String hotelAddress, ArrayList<String> selectedLocations){


       // Calling constructor from Ticket class
       super(passengerDetails, flightDetails, departureLocation, destinationLocation, departureDate, departureTime,
               destinationArrivalTime,seatNumber, ticketPrice);


       this.hotelAddress = hotelAddress; // Initializing the hotel address
       this.selectedLocations = selectedLocations; // Initializing selectedLocations array


   }// End of TouristTicket constructor


    // TODO : Add methods
    // Remove location from array
    public void removeLocation(String locationToBeRemoved){
       this.selectedLocations.remove(new String(locationToBeRemoved));

        System.out.println(this.selectedLocations);
    }// End of removeLocation method


    // Add new location in array
    public void addNewLocation(String locationToBeAdded){
       if (this.selectedLocations.size() >=5){
           System.out.println("Sorry! cannot add more than 5 locations");
       }
       else{
           this.selectedLocations.add(locationToBeAdded);
           System.out.println("Location added successfully!");
           System.out.println(this.selectedLocations);
       }
    }


    //TODO: Getters and setters


    public ArrayList<String> getSelectedLocations() {
        return this.selectedLocations;
    }
} // End of TouristTicket class