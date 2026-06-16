package HashMap;
import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map.get(1));

        if (map.containsKey(2)) {
            System.out.println("Key exists");
        }
    }
}