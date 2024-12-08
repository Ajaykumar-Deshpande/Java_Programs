import java.util.ArrayList;
import java.util.List;
public class ListIterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        ListIterator <String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // Output: One, Two, Three
        }
    }
}