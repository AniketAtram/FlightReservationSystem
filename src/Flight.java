public class Flight {


    // Attributes of Flight class
    String flightNumber;
    String airlineName;
    int flightCapacity;
    int numberOfSeatsBooked;
    boolean isAvailable;


    // Constructor of FlightClass


    public Flight(String flightNumber, String airlineName, int flightCapacity, int numberOfSeatsBooked, boolean isAvailable) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.flightCapacity = flightCapacity;
        this.numberOfSeatsBooked = numberOfSeatsBooked;
        this.isAvailable = isAvailable;
    }


    // Methods of Flight class


    // Get the details of the flight booked
    public String getFlightDetails(){
        return "Airline: "+airlineName+" Flight Number: "+flightNumber+" Number of seats: "+numberOfSeatsBooked;
    }


    // Check if the flight is available
    public String  checkFlightAvailability(){
        return (this.isAvailable)?"Available":"Not Available";
    }


    // Update number of seats
    public void setNumberOfSeatsBooked(int updatedSeats){
        this.numberOfSeatsBooked = updatedSeats;
    }
}