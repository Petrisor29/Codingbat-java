package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: word0
 *
 * Given an array of strings, return a Map<String, Integer> containing a key 
 * for every different string in the array, and the value 0 for each.
 */
public class Word0 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }

    public static void main(String[] args) {
        Word0 w0 = new Word0();

        // Test 1: ["a", "b", "a", "c"]
        String[] strings1 = {"a", "b", "a", "c"};
        System.out.println(w0.word0(strings1)); // {a=0, b=0, c=0}

        // Test 2: ["c", "b", "a"]
        String[] strings2 = {"c", "b", "a"};
        System.out.println(w0.word0(strings2)); // {a=0, b=0, c=0}

        // Test 3: ["c", "c", "c", "c"]
        String[] strings3 = {"c", "c", "c", "c"};
        System.out.println(w0.word0(strings3)); // {c=0}
        
        // Test 4: []
        String[] strings4 = {};
        System.out.println(w0.word0(strings4)); // {}
    }
}
