
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeysTolist {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Banana");
        map.put(20, "poppaya");
        map.put(30, "apple");
        map.put(40, "grapes");
        map.put(50, "sapota");

        System.out.println("\n1. Export Map Key to List...");
        
        List<Integer> result = new ArrayList(map.keySet());
        
        result.forEach(System.out::println);

        System.out.println("\n2. Export Map Value to List...");
        
        List<String> result2 = new ArrayList(map.values());
        
        result2.forEach(System.out::println);

    }

}
