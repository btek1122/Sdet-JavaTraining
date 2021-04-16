
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysTolist {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "banana");
        map.put(20, "orange");
        map.put(30, "grapes");
        map.put(40, "lemon");
        map.put(50, "apple");

        System.out.println("\n1. Export Map Key to List...");
        
        List<Integer> result = new ArrayList(map.keySet());
        
        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");
        
        List<String> result2 = new ArrayList(map.values());
        
        result2.forEach(System.out::println);

    }

}
