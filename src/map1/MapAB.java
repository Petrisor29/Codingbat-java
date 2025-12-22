package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: mapAB
 *
 * Modify and return the given map as follows: for this problem the map 
 * may or may not contain the "a" and "b" keys. If both keys are present, 
 * append their 2 string values together and store the result under the 
 * key "ab".
 */
public class MapAB {

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }

    public static void main(String[] args) {
        MapAB mAB = new MapAB();

        // Test 1: {"a": "Hi", "b": "There"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "Hi");
        map1.put("b", "There");
        System.out.println(mAB.mapAB(map1)); // {a=Hi, ab=HiThere, b=There}

        // Test 2: {"a": "Hi"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "Hi");
        System.out.println(mAB.mapAB(map2)); // {a=Hi}

        // Test 3: {"b": "There"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("b", "There");
        System.out.println(mAB.mapAB(map3)); // {b=There}

        // Test 4: {"a": "apple", "b": "banana", "c": "cherry"}
        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "apple");
        map4.put("b", "banana");
        map4.put("c", "cherry");
        System.out.println(mAB.mapAB(map4)); // {a=apple, ab=applebanana, b=banana, c=cherry}
    }
}
