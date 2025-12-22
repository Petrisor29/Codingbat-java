package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: mapShare
 *
 * Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that value. In all cases remove the key "c", 
 * leaving the rest of the map unchanged.
 */
public class MapShare {

    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        
        map.remove("c");
        
        return map;
    }

    public static void main(String[] args) {
        MapShare ms = new MapShare();

        // Test 1: {"a": "aaa", "b": "bbb", "c": "ccc"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bbb");
        map1.put("c", "ccc");
        System.out.println(ms.mapShare(map1)); // {a=aaa, b=aaa}

        // Test 2: {"b": "xyz", "c": "ccc"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("b", "xyz");
        map2.put("c", "ccc");
        System.out.println(ms.mapShare(map2)); // {b=xyz}

        // Test 3: {"a": "aaa", "c": "meh", "d": "hi"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "meh");
        map3.put("d", "hi");
        System.out.println(ms.mapShare(map3)); // {a=aaa, b=aaa, d=hi}
    }
}
