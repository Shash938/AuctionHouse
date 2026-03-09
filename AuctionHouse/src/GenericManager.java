import java.util.ArrayList;
import java.util.List;

public class GenericManager<T> {

    private List<T> list = new ArrayList<>();

    public void add(T obj) {
        list.add(obj);
    }

    public void remove(T obj) {
        list.remove(obj);
    }

    public List<T> getAll() {
        return list;
    }

    public void displayAll() {
        list.forEach(System.out::println);
    }
}