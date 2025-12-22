package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: topping2
 *
 * Given a map of food keys and topping values, modify and return the map as follows: 
 * if the key "ice cream" has a value, set that as the value for the key "yogurt" 
 * also. If the key "spinach" has a value, change that value to "nuts".
 */
public class Topping2 {

    public Map<String, String> topping2(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
        }

        if (map.containsKey("spinach")) {
            map.put("spinach", "nuts");
        }

        return map;
    }

    public static void main(String[] args) {
        Topping2 t2 = new Topping2();

        // Test 1: {"ice cream": "cherry"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "cherry");
        System.out.println(t2.topping2(map1)); // {ice cream=cherry, yogurt=cherry}

        // Test 2: {"spinach": "dirt", "ice cream": "cherry"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("spinach", "dirt");
        map2.put("ice cream", "cherry");
        System.out.println(t2.topping2(map2)); // {ice cream=cherry, spinach=nuts, yogurt=cherry}

        // Test 3: {"yogurt": "salt"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("yogurt", "salt");
        System.out.println(t2.topping2(map3)); // {yogurt=salt}

        // Test 4: {"spinach": "oil"}
        Map<String, String> map4 = new HashMap<>();
        map4.put("spinach", "oil");
        System.out.println(t2.topping2(map4)); // {spinach=nuts}
    }
}
