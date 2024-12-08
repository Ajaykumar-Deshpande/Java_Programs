import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        list.remove(1);
        System.out.println(list);
    }
}
