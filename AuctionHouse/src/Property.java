public class Property {

    protected int id;
    protected String name;
    protected double basePrice;

    public Property(int id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void display() {
        System.out.println("ID: " + id +
                " | Property: " + name +
                " | Base Price: ₹" + basePrice);
    }

    @Override
    public String toString() {
        return name + " (₹" + basePrice + ")";
    }
}