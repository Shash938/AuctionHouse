public class PropertyOperations<T extends Property> {

    public void validate(T property) {

        if (property.getBasePrice() > 100000)
            System.out.println(property.getName() + " is a Premium Property");
        else
            System.out.println(property.getName() + " is a Standard Property");
    }
}