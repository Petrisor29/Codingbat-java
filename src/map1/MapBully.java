package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: mapBully
 *
 * Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that value, and set the key "a" to have the 
 * value "". Basically "a" is a bully, taking the value and replacing 
 * it with an empty string.
 */
public class MapBully {

    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            String val = map.get("a");
            map.put("b", val);
            map.put("a", "");
        }
        return map;
    }

    public static void main(String[] args) {
        MapBully mb = new MapBully();

        // Test 1: {"a": "candy", "b": "dirt"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        System.out.println(mb.mapBully(map1)); // {a=, b=candy}

        // Test 2: {"a": "candy"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "candy");
        System.out.println(mb.mapBully(map2)); // {a=, b=candy}

        // Test 3: {"a": "candy", "b": "carrot", "c": "meh"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "candy");
        map3.put("b", "carrot");
        map3.put("c", "meh");
        System.out.println(mb.mapBully(map3)); // {a=, b=candy, c=meh}
    }
}
