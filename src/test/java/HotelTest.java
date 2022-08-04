import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Guest guest;
    Bedroom bedroom;

    @Before
    public void before(){
        hotel = new Hotel();
    }
    @Test
    public void hasGuests(){
        guest = new Guest("Toby");
        bedroom = new Bedroom(RoomType.SINGLE,101);
        hotel.addBedroom(bedroom);
        hotel.checkIn(guest,bedroom.getNumber());
        assertEquals(1, bedroom.countGuests());
    }
}
