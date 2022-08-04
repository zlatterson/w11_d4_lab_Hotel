public class Bedroom extends Room{
    private int number;

    public Bedroom(RoomType roomType, int number) {
        super(roomType);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
