package map1;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-1: topping1
 *
 * Given a map of food keys and topping values, modify and return the map as follows: 
 * if the key "ice cream" is present, set its value to "cherry". 
 * In all cases, set the key "bread" to have the value "butter".
 */
public class Topping1 {

    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        
        map.put("bread", "butter");
        
        return map;
    }

    public static void main(String[] args) {
        Topping1 t1 = new Topping1();

        // Test 1: {"ice cream": "peanuts"}
        Map<String, String> map1 = new HashMap<>();
        map1.put("ice cream", "peanuts");
        System.out.println(t1.topping1(map1)); // {bread=butter, ice cream=cherry}

        // Test 2: {}
        Map<String, String> map2 = new HashMap<>();
        System.out.println(t1.topping1(map2)); // {bread=butter}

        // Test 3: {"pancake": "syrup"}
        Map<String, String> map3 = new HashMap<>();
        map3.put("pancake", "syrup");
        System.out.println(t1.topping1(map3)); // {bread=butter, pancake=syrup}
        
        // Test 4: {"bread": "dirt", "ice cream": "strawberries"}
        Map<String, String> map4 = new HashMap<>();
        map4.put("bread", "dirt");
        map4.put("ice cream", "strawberries");
        System.out.println(t1.topping1(map4)); // {bread=butter, ice cream=cherry}
    }
}
