import java.util.ArrayList;

public abstract class Room {
private RoomType roomType;
private ArrayList<Guest> guests;

    public Room(RoomType roomType) {
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public RoomType getRoomType() {
        return roomType;
    }
    public int getRoomCapacity(){
        return roomType.getCapacity();
    }
    public void addGuest(Guest guest){
        guests.add(guest);
    }
    public int countGuests(){
        return guests.size();
    }

}
