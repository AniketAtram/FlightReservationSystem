public class Flight {

    // TODO : Add attributes

    private String flightNumber; // A unique flight number given to each flight starting with two letters and three numbers
    private String airlineName; // Name of the airlines
    private int flightCapacity = 200; // The seat capacity of the flight initialized to 200 for the sake of simplicity
    private boolean isAvailable = true; // Seats are always available unless seats booked equals total capacity
    private int numberOfSeatsBooked =0; // The number of seats booked
    private Passenger passenger; // The instance of passenger for whom the seat is booked


    // TODO : Create a constructor

    public Flight(String flightNumber, String airlineName, Passenger passenger) {
        this.flightNumber = flightNumber;
        this.airlineName = airlineName;
        this.passenger = passenger;
    }


    // TODO : Create methods

    // Get the details of the flight booked
    public String getFlightDetails(){

        return "Airline: "+airlineName+" Flight Number: "+flightNumber+" Number of seats booked: "+numberOfSeatsBooked;

    }// End of getFlightDetails method


    // Check if the seats are available
    public void  checkSeatAvailability(){

        if (this.numberOfSeatsBooked<flightCapacity){

            System.out.println("The seats ar available!");

        }
        else {

            System.out.println("Sorry!, The flight is overbooked! no seats available!");

            this.isAvailable = false;
        }
    }// End of check checkSeatAvailability method


    // update the number of seats in flight
    public void updateSeats(){
        this.numberOfSeatsBooked += 1;
        this.flightCapacity -=1;
    }

    // TODO: Add getters and setters

    // the status of availability of flight returns false if the seats are full
    public boolean isAvailable() {
        return isAvailable;
    }


    // Changes the flight capacity. Useful if seat is cancelled
    public void setFlightCapacity(int flightCapacity) {
        this.flightCapacity = flightCapacity;
    }

    // Changes the number of seats book. Useful if seat is cancelled
    public void setNumberOfSeatsBooked(int numberOfSeatsBooked) {
        this.numberOfSeatsBooked = numberOfSeatsBooked;
    }

    // Return 0 if the flight is full
    public int getFlightCapacity() {
        return flightCapacity;
    }

    // return the number of seats booked
    public int getNumberOfSeatsBooked() {
        return numberOfSeatsBooked;
    }
}