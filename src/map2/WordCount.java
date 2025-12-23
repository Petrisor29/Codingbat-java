package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: wordCount
 *
 * The classic word-count algorithm: given an array of strings, return a 
 * Map<String, Integer> with a key for each different string, with the 
 * value the number of times that string appears in the array.
 */
public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : strings) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        WordCount wc = new WordCount();

        // Test 1: ["a", "b", "a", "c", "b"]
        String[] s1 = {"a", "b", "a", "c", "b"};
        System.out.println(wc.wordCount(s1)); // {a=2, b=2, c=1}

        // Test 2: ["c", "b", "a"]
        String[] s2 = {"c", "b", "a"};
        System.out.println(wc.wordCount(s2)); // {a=1, b=1, c=1}

        // Test 3: ["c", "c", "c", "c"]
        String[] s3 = {"c", "c", "c", "c"};
        System.out.println(wc.wordCount(s3)); // {c=4}

        // Test 4: []
        String[] s4 = {};
        System.out.println(wc.wordCount(s4)); // {}
    }
}
