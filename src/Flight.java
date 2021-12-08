public class Flight {


    // TODO : Add attributes


    String flightNumber; // A unique flight number given to each flight starting with two letters and three numbers
    String airlineName; // Name of the airlines
    int flightCapacity; // The seat capacity of the flight
    int numberOfSeatsBooked; // The number of seats booked by the passenger
    boolean isAvailable; // Check weather the flight is available or not


    // TODO : Create a constructor


    public Flight(String flightNumber, String airlineName, int flightCapacity, int numberOfSeatsBooked, boolean isAvailable) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.flightCapacity = flightCapacity;
        this.numberOfSeatsBooked = numberOfSeatsBooked;
        this.isAvailable = isAvailable;
    }


    // TODO : Create methods


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