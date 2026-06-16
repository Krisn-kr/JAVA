package HashMap;
import java.util.HashMap; // Keep importing the real Java HashMap

public class HashMapp {   // Your custom class name is fine here!
    public static void main(String[] args) {

        // Use the official 'HashMap' here so you get all the built-in features
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map.get(1));

        if (map.containsKey(2)) {
            System.out.println("Key exists");
        }
    }
}