import java.util.ArrayList;
import java.util.List;

public class AddMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Third");
        list.add(1, "Second");

        System.out.println(list);
    }
}
