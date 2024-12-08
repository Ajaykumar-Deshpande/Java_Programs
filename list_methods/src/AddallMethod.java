import java.util.ArrayList;
import java.util.List;

public class AddallMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");

        List<String> list2 = new ArrayList<>();
        list2.add("Three");
        list2.add("Four");

        list1.addAll(1, list2);
        System.out.println(list1);
    }
}
