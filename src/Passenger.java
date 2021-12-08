public class Passenger {


    // TODO : Attributes of Passenger class

    private static int idCounter = 0; // a counter attribute to keep track of instances created
    private int id; // This attribute will be used to assign a unique id to each passenger
    private Contact contact; // attribute of type Contact
    private Address address; // attribute of type Address



    // TODO : Constructor of Passenger class
    /** Takes six parameters and creates instances of Contact and Address by passing the values to it
     *  and keeps track of instances created with the help of idCounter
     * @param name : The name of the passenger
     * @param number : The contact number of the passenger
     * @param email : The email address provided by the passenger
     * @param city : The city to which the passenger belongs
     * @param state: The state to which the passenger belongs
     * @param street : The address of the passenger
     **/

    public Passenger(String name, String number, String email, String city, String state, String street) {
        this.id = idCounter; // Assign the idCounter value to the Passenger instance attribute id
        this.contact = new Contact(name, number, email); // Composite relationship with Passenger class and Contact
        this.address = new Address(street, city, state); // Composite relationship with Passenger class and Address
        idCounter+=1; // Increment the idCounter by one
    }


    // TODO : Provide classes that form composite relationship


    private static class Contact{

        // Attributes of contact class
        String contactName; // Name of the passenger
        String contactPhoneNumber; // Phone number of passenger
        String contactEmail; // Email address of passenger


        // Constructor of Contact class
        public Contact(String contactName, String contactPhoneNumber, String contactEmail) {
            this.contactName = contactName;
            this.contactPhoneNumber = contactPhoneNumber;
            this.contactEmail = contactEmail;
        }// End of Contact class constructor


        // Update contact details
        public void updateContactDetails(String name, String number, String email){
            this.contactEmail = email;
            this.contactName = name;
            this.contactPhoneNumber = number;
        }// End of update contact details method


    } // End of Contact class


    private static class Address{

        // Attributes of Address class
        String addressCity; // City to which passenger belongs
        String addressState; // State to which passenger belongs
        String addressStreet; // Street and other location/landmark details of address


        // Constructor of address class
        public Address(String addressCity, String addressState, String addressStreet) {
            this.addressCity = addressCity;
            this.addressState = addressState;
            this.addressStreet = addressStreet;
        } // End of Address constructor


        // Update address details
        public void updateAddressDetails(String city, String state, String street){
            this.addressCity = city;
            this.addressState = state;
            this.addressStreet = street;
        } // End of updateAddress Method


    } // End of Address class


    // TODO : Create methods

    /**These methods print the contact and address details of the passenger**/

    public void fetchContactDetails(){
        System.out.println("Name of Passenger: "+contact.contactName+"\nEmail address: "+contact.contactEmail+"\nPhone number: "+contact.contactPhoneNumber);

    } // End of fetchContactDetails


    public void fetchAddressDetails(){
        System.out.println("Street: "+address.addressStreet+"\nCity: "+address.addressCity+"\nState: "+address.addressState);
    } // End of fetchAddressDetails


    /**These methods update the contact and address details of customer**/

    public void updateContactDetails(String name, String phone, String email){
        contact.updateContactDetails(name, phone, email);
    } // End of updateContactDetails method


    public void updateAddressDetails(String street, String state, String city){
        address.updateAddressDetails(city, state, street);
    } // End of updateAddressDetails method



    // TODO : Provide getters and setters

    // Getter for the id for each passenger instance

    public int getId() {
        return id;
    } // End of getId method


}// End of passenger class