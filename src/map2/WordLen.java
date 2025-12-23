package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: wordLen
 *
 * Given an array of strings, return a Map<String, Integer> containing a key 
 * for every different string in the array, and the value is its length.
 */
public class WordLen {

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }

    public static void main(String[] args) {
        WordLen wl = new WordLen();

        // Test 1: ["a", "bb", "a", "bb"]
        String[] strings1 = {"a", "bb", "a", "bb"};
        System.out.println(wl.wordLen(strings1)); // {a=1, bb=2}

        // Test 2: ["this", "and", "that", "and"]
        String[] strings2 = {"this", "and", "that", "and"};
        System.out.println(wl.wordLen(strings2)); // {that=4, and=3, this=4}

        // Test 3: ["code", "code", "code", "bug"]
        String[] strings3 = {"code", "code", "code", "bug"};
        System.out.println(wl.wordLen(strings3)); // {code=4, bug=3}
        
        // Test 4: []
        String[] strings4 = {};
        System.out.println(wl.wordLen(strings4)); // {}
    }
}
