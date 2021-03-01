import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String>  list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for (String str : list) {
            System.out.println(str);
        }
    }
}
