import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void main(String[] args) {

        // Aniket has entered his details as requested
        String name = "Aniket Atram";
        String phoneNumber = "9876543210";
        String emailAddress = "aniket@email.com";
        String city = "Nagpur";
        String state = "Maharashtra";
        String street = "KP-Sector 14";



        Passenger aniket = new Passenger(name,phoneNumber,emailAddress,
                city,state,street);
//        System.out.println();
//        aniket.fetchContactDetails();
//        System.out.println();
//        aniket.fetchAddressDetails();


        // Aniket is now checking and selecting flight
        String selectedFlightNumber = "NH6756";
        String selectedFlightName = "Jet Airways";

        Flight jetAirways = new Flight(selectedFlightNumber, selectedFlightName, aniket);
//        System.out.println();
//        System.out.println("Are seats available?");
//        jetAirways.checkSeatAvailability();
//        System.out.println();
//        System.out.println(":::Flight details:::");
//        System.out.println(jetAirways.getFlightDetails());

        // Aniket is now booking regular ticket
        String departureLocation = "Nagpur";
        String departureDestination = "Goa";
        String departureDate = "31-12-2021";
        String departureTime = "10:45 AM";
        String destinationArrivalTime = "13:30 PM";
        int seatNumber = 12;
        float ticketPrice = 1500.00F;
        ArrayList<String> servicesByAniket = new ArrayList<>();
        servicesByAniket.add("Breakfast");
        servicesByAniket.add("Lunch");

        RegularTicket regularTicket = new RegularTicket(aniket, jetAirways, departureLocation, departureDestination, departureDate,departureTime, destinationArrivalTime, seatNumber,ticketPrice,servicesByAniket);
//        System.out.println();
//        System.out.println("Services availed are:");
//        regularTicket.getServicesAvailed();
//        System.out.println();
//        System.out.println(regularTicket.checkFlightDuration());
//        System.out.println();
        regularTicket.bookTicket();
//        System.out.println();
//        System.out.println("::Booking Details::");
//        System.out.println(jetAirways.getFlightDetails());
//        System.out.println();
//        System.out.println(regularTicket.getBookingStatus());
//        System.out.println(regularTicket.getPnrNumber());


        // Aniket is now booking tourist ticket

        ArrayList<String> selectedLocations = new ArrayList<>();
        // He selected these locations
        selectedLocations.add("Vagatore");
        selectedLocations.add("Anjuna Beach");
        selectedLocations.add("Casino");
        // This is his hotel address
        String hotelAddr = "Somewhere in Goa.";

        // Now he books TouristTicket
        TouristTicket touristTicket = new TouristTicket(aniket, jetAirways, departureLocation, departureDestination, departureDate,departureTime, destinationArrivalTime, seatNumber,ticketPrice,hotelAddr,selectedLocations);
//        System.out.println();
        touristTicket.bookTicket();
//        System.out.println();
//        System.out.println(jetAirways.getFlightDetails());

        getTicketDetails(regularTicket);
        getTicketDetails(touristTicket);
    }

    public static void getTicketDetails(Ticket ticket){

        System.out.println("PNR Number: "+ ticket.getPnrNumber());
    }
}
/**OUTPUT:
 * Ticket has been booked!
 * Ticket has been booked!
 * PNR Number: HKI224495
 * PNR Number: CXZ429165
 * **/