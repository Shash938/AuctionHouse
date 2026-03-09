import java.util.Collection;

public class DisplayUtil {

    public static <T> void display(Collection<T> items) {

        for (T item : items) {
            System.out.println(item);
        }

    }
}