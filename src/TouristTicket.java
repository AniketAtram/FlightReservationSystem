public class TouristTicket {


    // TODO: Add attributes
    String hotelAddress; // The address where the passenger is staying
    String[] selectedLocations; // Tourist locations selected by the passenger


    // TODO : Add a constructor

    public TouristTicket(String hotelAddress, String[] selectedLocations) {
        this.hotelAddress = hotelAddress;
        this.selectedLocations = selectedLocations;
    }


    // TODO : Add methods


    // Add new locations to the locations array
    public void addTouristLocation(String[] location){
        for(int i=0;i<location.length;i++){
            this.selectedLocations[i] = location[i];
        }
    }


    // Remove locations
    public void removeLocations(){
        System.out.println("Location removed");
    }
}