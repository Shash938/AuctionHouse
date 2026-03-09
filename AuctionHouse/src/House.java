public class House extends Property {

    private int rooms;

    public House(int id, String name, double basePrice, int rooms) {
        super(id, name, basePrice);
        this.rooms = rooms;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Rooms: " + rooms);
    }
}