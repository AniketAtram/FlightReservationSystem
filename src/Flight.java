public class Flight {


    // TODO : Add attributes


    private String flightNumber; // A unique flight number given to each flight starting with two letters and three numbers
    private String airlineName; // Name of the airlines
    private int flightCapacity = 200; // The seat capacity of the flight initialized to 200
    private int numberOfSeatsBooked =0; // The number of seats booked
    private boolean isAvailable; // Check weather the flight is available or not
    private Passenger passenger;



    // TODO : Create a constructor

    public Flight(String flightNumber, String airlineName, Passenger passenger) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.passenger = passenger;
    }


    // TODO : Create methods


    // Get the details of the flight booked
    public String getFlightDetails(){
        return "Airline: "+airlineName+" Flight Number: "+flightNumber+" Number of seats: "+numberOfSeatsBooked;
    }


    // Check if the flight is available
    public String  checkFlightAvailability(){
        return (this.numberOfSeatsBooked<flightCapacity)?"Available":"Not Available";
    }

    // book a seat
    public void bookSeat(){
        this.flightCapacity -=1;
        this.numberOfSeatsBooked += 1;
        System.out.println("Flight booked successfully!");
    }


    // getter setter
    public boolean isAvailable() {
        return isAvailable;
    }


}