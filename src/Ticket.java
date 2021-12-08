public abstract class Ticket {

    // TODO: Add attributes
    private int pnrNumber; // A unique identification number for each ticket booked by passenger
    private String departureLocation; // Location from where the passenger is boarding
    private String destinationLocation; // Location where the passenger is travelling
    private String departureDate; // Date for which the flight is booked
    private String departureTime; // Time when the flight leaves from departure location
    private String destinationArrivalTime; // Time at which the flight will land
    private int seatNumber; // Seat number of the passenger
    private float ticketPrice; // Amount paid by the passenger
    private boolean isCancelled; // Weather the passenger has cancelled ticket or not
    Passenger passengerDetails; // Aggregate relationship between Ticket and Passenger
    Flight flightDetails; // Aggregate relationship between Flight and Passenger


    // TODO: Create a constructor
    public Ticket(int pnrNumber, String departureLocation, String destinationLocation, String departureDate,
                  String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice
                  , Passenger passengerDetails, Flight flightDetails) {

        this.pnrNumber = pnrNumber;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destinationArrivalTime = destinationArrivalTime;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
        this.passengerDetails = passengerDetails;
        this.flightDetails = flightDetails;

    } // End of constructor for Ticket class


    // TODO: Create methods
    //Check the status of flight
    public String checkFlightStatus(Flight flight){
        return (flight.isAvailable())? "Flight is available":"Your flight is cancelled!";
    } // End of checkFlightStatus method


    // Check the duration of flight
    public String checkFlightDuration(){

        // Split the string with delimeter ":" example 12:30 pm will be split as ["12", "30 pm"]
        String[] t1 = departureTime.split(":",2);
        String[] t2 = destinationArrivalTime.split(":", 2);

        // After splitting the first element will be hour since time is entered as HH:mm in 24 hours format
        int departureHours = Integer.parseInt(t1[0]);
        int destinationArrivalHours = Integer.parseInt(t2[0]);

        // The second element from the ti list is split with spaces for example "30 pm" will be split as ["30", "pm"]
        String[] t2min = t2[1].split(" ", 2);
        String[] t1min = t1[1].split(" ", 2);

        // Converting the string to integers
        int departureMinutes = Integer.parseInt(t1min[0]);
        int destinationArrivalMinutes = Integer.parseInt(t2min[0]);

        // calculating total hours and minutes
        int totalHours = destinationArrivalHours-departureHours;
        int totalMinutes = destinationArrivalMinutes-departureMinutes;

        // if total hours or minutes  is negative, multiply it with -1
        if(totalHours < 0){
            totalHours *= -1;
        }
        else if(totalMinutes < 0){
            totalMinutes *= -1;
        }

        return "Total duration of flight is "+totalHours+" hours and "+totalMinutes+" minutes";

    }// End of checkFlightDuration method


    // Cancel ticket
    public void cancelFlightTicket(){
        this.isCancelled = true;
        System.out.println("Flight has been cancelled!!");
    }// End of cancelFlightTicket method


    // TODO : Getters and setters
    public int getPnrNumber() {
        return pnrNumber;
    }


} // End of Ticket class