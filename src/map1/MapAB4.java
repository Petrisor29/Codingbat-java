package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: mapAB4
 *
 * Modify and return the given map as follows: if the keys "a" and "b" are present, 
 * get their lengths. If they are not the same length, type of length, 
 * set the key "c" to have the longer value. If the values are the same length, 
 * change both "a" and "b" values to the empty string.
 */
public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            int aLen = map.get("a").length();
            int bLen = map.get("b").length();

            if (aLen == bLen) {
                map.put("a", "");
                map.put("b", "");
            } else {
                String cVal = (aLen > bLen) ? map.get("a") : map.get("b");
                map.put("c", cVal);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        MapAB4 mAB4 = new MapAB4();

        // Test 1: a="aaa", b="bb", lungimi diferite -> c="aaa"
        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "aaa");
        map1.put("b", "bb");
        System.out.println(mAB4.mapAB4(map1)); // {a=aaa, b=bb, c=aaa}

        // Test 2: a="bb", b="ccc", lungimi diferite -> c="ccc"
        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "bb");
        map2.put("b", "ccc");
        System.out.println(mAB4.mapAB4(map2)); // {a=bb, b=ccc, c=ccc}

        // Test 3: a="aaa", b="bbb", lungimi egale -> a="", b=""
        Map<String, String> map3 = new HashMap<>();
        map3.put("a", "aaa");
        map3.put("b", "bbb");
        System.out.println(mAB4.mapAB4(map3)); // {a=, b=}

        // Test 4: Doar o cheie prezentă -> nicio schimbare
        Map<String, String> map4 = new HashMap<>();
        map4.put("a", "aaa");
        System.out.println(mAB4.mapAB4(map4)); // {a=aaa}
    }
}
