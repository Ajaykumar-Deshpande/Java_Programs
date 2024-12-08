import java.util.ArrayList;
import java.util.List;

public class SetMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        list.set(1, "Yellow");
        System.out.println(list);
    }
}


