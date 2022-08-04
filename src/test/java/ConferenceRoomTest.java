import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;
    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(RoomType.CONFERENCE, "Conference Room 1");
    }

    @Test
    public void hasName() {
        assertEquals("Conference Room 1", conferenceRoom.getName());
    }

    @Test
    public void hasCapacity() {
        assertEquals(100, conferenceRoom.getRoomCapacity());
    }

    @Test
    public void hasRoomType() {
        assertEquals(RoomType.CONFERENCE, conferenceRoom.getRoomType());
    }
    @Test
    public void hasGuests(){
        guest = new Guest("Toby");
        conferenceRoom.addGuest(guest);
        assertEquals(1,conferenceRoom.countGuests());
    }

}
