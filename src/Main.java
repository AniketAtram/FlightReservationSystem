public class Main {


    public static void main(String[] args) {

        String name = "Aniket";
        String number = "09876543210";
        String email = "aniket@email.com";
        String city = "Nagpur";
        String state = "Maharashtra";
        String street = "12-lname";

        Passenger passenger = new Passenger(name, number, email, city, state, street);
        Passenger passenger1 = new Passenger(name, number, email, city, state, street);
        Passenger passenger2 = new Passenger(name, number, email, city, state, street);
        Passenger passenger3 = new Passenger(name, number, email, city, state, street);
        Passenger passenger4 = new Passenger(name, number, email, city, state, street);
        System.out.println(passenger.getId());
        System.out.println(passenger1.getId());
        System.out.println(passenger2.getId());
        System.out.println(passenger3.getId());
        System.out.println(passenger4.getId());

//
//        System.out.println(passenger.getAddressDetails());
//        System.out.println(passenger.getContactDetails());
    }
}
