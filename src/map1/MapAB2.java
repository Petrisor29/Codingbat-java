package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: mapAB2
 *
 * Modify and return the given map as follows: if the keys "a" and "b" 
 * are both in the map and have equal values, remove them both.
 */
public class MapAB2 {

    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") && 
            map.get("a").equals(map.get("b"))) {
            
            map.remove("a");
            map.remove("b");
        }
        
        return map;
    }

    public static void main(String[] args) {
        MapAB2 mAB2 = new MapAB2();

        // Test 1: {"a": "aaa", "b": "aaa", "c": "cake"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "aaa");
        map1.put("c", "cake");
        System.out.println(mAB2.mapAB2(map1)); // {c=cake}

        // Test 2: {"a": "aaa", "b": "bbb"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "aaa");
        map2.put("b", "bbb");
        System.out.println(mAB2.mapAB2(map2)); // {a=aaa, b=bbb}

        // Test 3: {"a": "aaa", "c": "cake"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("c", "cake");
        System.out.println(mAB2.mapAB2(map3)); // {a=aaa, c=cake}
        
        // Test 4: {"a": "x", "b": "y", "z": "y"}
        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "x");
        map4.put("b", "y");
        map4.put("z", "y");
        System.out.println(mAB2.mapAB2(map4)); // {a=x, b=y, z=y}
    }
}
