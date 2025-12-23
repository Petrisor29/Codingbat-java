package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: wordMultiple
 *
 * Given an array of strings, return a Map<String, Boolean> where each different 
 * string is a key and its value is true if that string appears 2 or more 
 * times in the array.
 */
public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, true);
            } else {
                map.put(s, false);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        WordMultiple wm = new WordMultiple();

        // Test 1: ["a", "b", "a", "c", "b"]
        String[] s1 = {"a", "b", "a", "c", "b"};
        System.out.println(wm.wordMultiple(s1)); // {a=true, b=true, c=false}

        // Test 2: ["c", "b", "a"]
        String[] s2 = {"c", "b", "a"};
        System.out.println(wm.wordMultiple(s2)); // {a=false, b=false, c=false}

        // Test 3: ["c", "c", "c", "c"]
        String[] s3 = {"c", "c", "c", "c"};
        System.out.println(wm.wordMultiple(s3)); // {c=true}
        
        // Test 4: []
        String[] s4 = {};
        System.out.println(wm.wordMultiple(s4)); // {}
    }
}
