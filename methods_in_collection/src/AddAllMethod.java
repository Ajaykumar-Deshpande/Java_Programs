import java.util.ArrayList;
import java.util.Collection;

public class AddAllMethod {
        public static void main(String[] args) {
            Collection<String> collection1 = new ArrayList<>();
            collection1.add("Dog");
            collection1.add("Cat");

            Collection<String> collection2 = new ArrayList<>();
            collection2.add("Rabbit");
            collection2.add("Horse");

            collection1.addAll(collection2);
            System.out.println(collection1);
        }
    }


