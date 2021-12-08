public class Main {


    public static void main(String[] args) {

        String name = "Aniket";
        String number = "09876543210";
        String email = "aniket@email.com";
        String city = "Nagpur";
        String state = "Maharashtra";
        String street = "12-lname";

        Passenger passenger = new Passenger(name, number, email, city, state, street);
//        Passenger passenger1 = new Passenger();
        passenger.fetchAddressDetails();
        passenger.fetchContactDetails();
        passenger.updateContactDetails("Aniket.A","976543210", "a.a@email.com");
        passenger.fetchContactDetails();

//
//        System.out.println(passenger.getAddressDetails());
//        System.out.println(passenger.getContactDetails());
    }
}
