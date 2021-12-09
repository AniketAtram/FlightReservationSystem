import java.util.ArrayList;
// This class is subclass of base class Ticket
public class RegularTicket extends Ticket{


    // TODO : Add attributes
    private ArrayList<String> servicesRequested; // Services such as food , water, etc. availed by passenger


    // TODO : Add constructor

    public RegularTicket(Passenger passengerDetails, Flight flightDetails, String departureLocation, String destinationLocation, String departureDate,
                         String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice,
                         ArrayList<String> servicesRequested){


        // Calling the constructor from Ticket class
        super(passengerDetails, flightDetails, departureLocation,destinationLocation,departureDate, departureTime, destinationArrivalTime,seatNumber,
                ticketPrice);


        this.servicesRequested = servicesRequested; // initializing the servicesRequested attribute


    }// End of RegularTicket constructor


    // TODO : Add methods

    // Adds services as per passenger's request
    public void addNewServices(ArrayList<String> newServices){
        this.servicesRequested.addAll(newServices);
        System.out.println(this.servicesRequested);
    }//End of addNewServices method


    // returns the services requested by the passenger
    public void getServicesAvailed(){
        System.out.println(this.servicesRequested);
    }// End of getServicesAvailed method
}