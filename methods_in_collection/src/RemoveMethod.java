import java.util.ArrayList;
import java.util.Collection;

public class RemoveMethod {

    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("One");
        collection.add("Two");
        collection.add("Three");

        collection.remove("Three");
        System.out.println(collection);
    }
}

