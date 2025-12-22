package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: topping3
 *
 * Given a map of food keys and topping values, modify and return the map as follows: 
 * if the key "potato" has a value, set that as the value for the key "fries" also. 
 * If the key "salad" has a value, set that as the value for the key "spinach" also.
 */
public class Topping3 {

    public Map<String, String> topping3(Map<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries", map.get("potato"));
        }

        if (map.containsKey("salad")) {
            map.put("spinach", map.get("salad"));
        }

        return map;
    }

    public static void main(String[] args) {
        Topping3 t3 = new Topping3();

        // Test 1: {"potato": "ketchup"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("potato", "ketchup");
        System.out.println(t3.topping3(map1)); // {fries=ketchup, potato=ketchup}

        // Test 2: {"potato": "butter", "salad": "oil"}
        Map<String, String> map2 = new HashMap<>();
        map2.put("potato", "butter");
        map2.put("salad", "oil");
        System.out.println(t3.topping3(map2)); // {fries=butter, potato=butter, salad=oil, spinach=oil}

        // Test 3: {"salad": "pepper"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("salad", "pepper");
        System.out.println(t3.topping3(map3)); // {salad=pepper, spinach=pepper}

        // Test 4: {"fries": "salt"}
        Map<String, String> map4 = new HashMap<>();
        map4.put("fries", "salt");
        System.out.println(t3.topping3(map4)); // {fries=salt}
    }
}
