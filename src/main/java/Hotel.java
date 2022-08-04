import java.util.ArrayList;

public class Hotel{
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public void addBedroom(Bedroom bedroom) {
        bedrooms.add(bedroom);
    }

    public void checkIn(Guest guest, int roomNumber) {
        for(Bedroom bedroom : bedrooms){
            if(bedroom.getNumber() == roomNumber){
                bedroom.addGuest(guest);
            }
        }
    }
    public void checkIn(Guest guest, ConferenceRoom conferenceRoom){

    }
}
