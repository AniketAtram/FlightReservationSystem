public class Passenger {


    // TODO : Add attributes


    String contactName; // Name of the passenger
    String contactPhoneNumber; // Phone number of passenger
    String contactEmail; // Email address of passenger
    String addressCity; // City to which passenger belongs
    String addressState; // State to which passenger belongs
    String addressStreet; // Street and other location/landmark details of address


    // TODO : Create a constructor


    public Passenger(String contactName, String contactPhoneNumber, String contactEmail, String addressCity, String addressState, String addressStreet) {
        this.contactName = contactName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.contactEmail = contactEmail;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressStreet = addressStreet;
    }


    // TODO : Create methods


    // Method that fetches the contact details of the passenger


    public String getContactDetails(){
        return "Name: " +contactName +" Phone Number: "+contactPhoneNumber+" Email: "+contactEmail;
    }// end of getContactDetails method


    // Method that updates contact details of the passenger


    public void updateContactDetails(String name, String number, String mail){
        this.contactName = name;
        this.contactPhoneNumber = number;
        this.contactEmail = mail;
    }// end of updateContactDetails method


    // Method that fetches address details of the passenger


    public String getAddressDetails(){
        return "Street: "+addressStreet+" City: "+addressCity+" State: "+addressState;
    }// end of getAddressDetails method


    // Method that updates the address details of the passenger


    public void updateAddressDetails(String street, String city, String state){
        this.addressStreet = street;
        this.addressCity = city;
        this.addressState = state;
    }// end of updateAddressDetails method
}