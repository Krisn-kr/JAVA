package HashMap;
import java.util.HashMap; // Keep importing the real Java HashMap
import java.util.Map;
import java.util.Set;

public class HashMapp {   // Your custom class name is fine here!
    public static void main(String[] args) {

        // Use the official 'HashMap' here so you get all the built-in features
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Apple");
        map.put(2, "Banana");

        System.out.println(map.get(1));

        /// contians key 

        if (map.containsKey(2)) {
            System.out.println("Key exists");
        }

        //  printing the keys and the values on the map, using entry point
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.println(e.getValue()+" ");
            System.out.println(e.getKey());

        }

        // printing the keys and values corresponding to the key 
        //   Using set 
        Set<Integer>keys = map.keySet();
        for(Integer key : keys) {
            System.out.println(key+" "+map.get(key));
        }

        //  Removing the apir

        map.remove(1);
        System.out.println(map);
       
    }
}