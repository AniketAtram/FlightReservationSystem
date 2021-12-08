public class RegularTicket extends Ticket{


    // TODO : Add attributes
    private String[] servicesRequested; // Services such as food , water, etc. availed by passenger


    // TODO : Add constructor

    public RegularTicket(int pnrNumber, String departureLocation, String destinationLocation, String departureDate,
                         String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice,
                         Passenger passengerDetails, Flight flightDetails, String[] servicesRequested){


        // Calling the constructor from Ticket class
        super(pnrNumber, departureLocation,destinationLocation,departureDate, departureTime, destinationArrivalTime,seatNumber,
                ticketPrice, passengerDetails, flightDetails);


        this.servicesRequested = servicesRequested; // initializing the servicesRequested attribute


    }// End of RegularTicket constructor


    // TODO : Add methods

    public void checkServicesAvailed(){
        System.out.println("Services Availed are:");
        for(int i=0;i<servicesRequested.length;i++){
            System.out.println("["+(i+1)+"] "+servicesRequested[i]);
        }
    }


    public void updateServices(String[] servicesRequested){
        this.servicesRequested = servicesRequested;
    }

    // TODO : Add getters and setters


}