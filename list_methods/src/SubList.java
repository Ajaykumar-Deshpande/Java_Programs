import java.util.ArrayList;
import java.util.List;

public class SubList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        List<String> sublist = list.subList(1, 3);
        System.out.println(sublist);
    }
}
