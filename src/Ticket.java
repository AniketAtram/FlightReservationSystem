import java.util.*;
// This class is base class for RegularTicket and TouristTicket classes
public abstract class Ticket {

    // TODO: Add attributes
    private String pnrNumber; // A unique identification number for each ticket booked by passenger
    private String departureLocation; // Location from where the passenger is boarding
    private String destinationLocation; // Location where the passenger is travelling
    private String departureDate; // Date for which the flight is booked
    private String departureTime; // Time when the flight leaves from departure location
    private String destinationArrivalTime; // Time at which the flight will land
    private int seatNumber; // Seat number of the passenger
    private float ticketPrice; // Amount paid by the passenger
    private String bookingStatus; // Weather the passenger has cancelled ticket or not
    Passenger passengerDetails; // Aggregate relationship between Ticket and Passenger
    Flight flightDetails; // Aggregate relationship between Flight and Passenger


    // TODO: Create a constructor
    public Ticket(Passenger passengerDetails, Flight flightDetails,String departureLocation, String destinationLocation, String departureDate,
                  String departureTime, String destinationArrivalTime,int seatNumber, float ticketPrice
                  ) {

        this.passengerDetails = passengerDetails;
        this.flightDetails = flightDetails;
        this.departureLocation = departureLocation;
        this.destinationLocation = destinationLocation;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.destinationArrivalTime = destinationArrivalTime;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;

        this.bookingStatus = "Pending"; // Initialize the status to pending until the passenger books ticket

    } // End of constructor for Ticket class


    // TODO: Create methods
    //Check the status of flight weather it is available or overbooked
    public String checkFlightStatus(Flight flight){

        return (flight.isAvailable())? "Flight is available":"Your flight is cancelled or overbooked.";

    } // End of checkFlightStatus method


    // Check the duration of flight
    public String checkFlightDuration(){

        // Split the string with delimiter ":" example 12:30 pm will be split as ["12", "30 pm"]
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


    // Book a ticket
    public void bookTicket(){

        if(this.flightDetails.isAvailable()){
            this.bookingStatus = "Confirmed"; // Set the booking status to book
            // Randomly assign a PNR to the passenger
            Random generator = new Random();
            String[] myArray = new String[] {"ABY985543", "JQP976609", "HKI224495"};
            int randomInt = generator.nextInt(myArray.length);
            String generatedPNR = myArray[randomInt];
            // Save the PNR number
            this.pnrNumber = generatedPNR;
            // Update the seats in flight
            this.flightDetails.updateSeats();
            System.out.println("Ticket has been booked!");
        }
        else {
            System.out.println("Sorry! The flight is either cancelled or overbooked!");
        }
    }// End of bookTicket method


    // Cancel ticket
    public void cancelFlightTicket(){

        this.bookingStatus = "Cancelled"; // Set the ticket status to cancelled
        // add one seat back to the flight
        this.flightDetails.setFlightCapacity(this.flightDetails.getFlightCapacity()+1);
        // update number of seats booked by removing the number of seats
        this.flightDetails.setNumberOfSeatsBooked(this.flightDetails.getNumberOfSeatsBooked()-1);

    }// End of cancelFlightTicket method


    // TODO : Getters and setters
    public String getPnrNumber() {
        return pnrNumber;
    }
} // End of Ticket class