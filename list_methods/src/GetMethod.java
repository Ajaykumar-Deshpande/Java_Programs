import java.util.ArrayList;
import java.util.List;

public class GetMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        String element = list.get(2);
        System.out.println(element);
    }
}
