import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        String name = "Jigar Jani";
        String phoneNumber = "9876543210";
        String emailAddress = "jigarjani@eail.com";
        String city = "Ahmadabad";
        String state = "Gujrat";
        String street = "Gandhi Nagar Chowk";
        String[] servicesByJigar = new String[]{"food", "breakfast"};
        String[] updatedServicesByJigar = new String[]{"Food", "Breakfast", "Brunch"};

        Passenger jigar = new Passenger(name,phoneNumber,emailAddress,
                city,state,street);
        jigar.fetchContactDetails();
        jigar.fetchAddressDetails();


        String selectedFlightNumber = "NH6756";
        String selectedFlightName = "Jet Airways";

        Flight jigarFlight = new Flight(selectedFlightNumber, selectedFlightName, jigar);
        System.out.println(jigarFlight.getFlightDetails());


        int pnr = 123456789;
        String departureLocation = "Gujrat";
        String destinationLocation = "Goa";
        String departureDate = "31/12/2021";
        String departureTime = "11:30 AM";
        String destinationArrivalTime = "13:15 PM";
        int seatNumber = 12;
        float ticketPrice = 1398.97F;

        RegularTicket jigarTicket = new RegularTicket(pnr, departureLocation,destinationLocation,departureDate,
                departureTime, destinationArrivalTime, seatNumber, ticketPrice, jigar, jigarFlight, servicesByJigar);

        System.out.println(jigarTicket.checkFlightDuration());
        jigarTicket.checkServicesAvailed();
        jigarTicket.updateServices(updatedServicesByJigar);
        jigarTicket.checkServicesAvailed();
        System.out.println(jigarTicket.checkFlightDuration());

        String hotelAddr = "24 jump street";
        ArrayList <String> locations = new ArrayList<String>();
        locations.add("Vagatore");
        locations.add("Panaji");
        locations.add("Anjuna Beach");


        TouristTicket jigarTouristTicket = new TouristTicket(pnr, departureLocation,destinationLocation,departureDate,
                departureTime, destinationArrivalTime, seatNumber, ticketPrice, jigar, jigarFlight,hotelAddr, locations);

        jigarTouristTicket.removeLocation("Anjuna beach");

        System.out.println(jigarTouristTicket.getSelectedLocations());








    }
}
