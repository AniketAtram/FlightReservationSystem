public class Main {


    public static void main(String[] args) {

        String name = "Aniket";
        String number = "09876543210";
        String email = "aniket@email.com";
        String city = "Nagpur";
        String state = "Maharashtra";
        String street = "12-lname";

        Passenger passenger = new Passenger(name, number, email, city, state, street);

        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());
    }
}
