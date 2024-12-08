import java.util.ArrayList;
import java.util.List;

public class IndexOfMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        int index = list.indexOf("Banana");
        System.out.println(index);
    }
}
