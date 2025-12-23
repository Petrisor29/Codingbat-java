package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: pairs
 *
 * Given an array of non-empty strings, create and return a Map<String, String> 
 * as follows: for each string add its first character as a key with 
 * its last character as the value.
 */
public class Pairs {

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (String s : strings) {
            String first = s.substring(0, 1);
            String last = s.substring(s.length() - 1);
            map.put(first, last);
        }

        return map;
    }

    public static void main(String[] args) {
        Pairs p = new Pairs();

        // Test 1: ["code", "bug"]
        String[] strings1 = {"code", "bug"};
        System.out.println(p.pairs(strings1)); // {"c": "e", "b": "g"}

        // Test 2: ["man", "moon", "main"]
        String[] strings2 = {"man", "moon", "main"};
        System.out.println(p.pairs(strings2)); // {"m": "n"}

        // Test 3: ["man", "moon", "good", "night"]
        String[] strings3 = {"man", "moon", "good", "night"};
        System.out.println(p.pairs(strings3)); // {"g": "d", "m": "n", "n": "t"}
        
        // Test 4: ["apple", "banana", "area"]
        String[] strings4 = {"apple", "banana", "area"};
        System.out.println(p.pairs(strings4)); // {"a": "a", "b": "a"}
    }
}
