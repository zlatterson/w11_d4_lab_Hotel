import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 101);
    }
    @Test
    public void hasRoomNumber(){
        assertEquals(101, bedroom.getNumber());
    }
    @Test
    public void hasBedroomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, bedroom.getRoomCapacity());
    }
}