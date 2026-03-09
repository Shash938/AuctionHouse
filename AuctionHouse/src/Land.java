public class Land extends Property {

    private double area;

    public Land(int id, String name, double basePrice, double area) {
        super(id, name, basePrice);
        this.area = area;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Area: " + area + " sq.ft");
    }
}