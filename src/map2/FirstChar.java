package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: firstChar
 *
 * Given an array of strings, return a Map<String, String> containing a key 
 * for every different first character seen, with the value of all the 
 * strings starting with that character appended together in the order 
 * they appear in the array.
 */
public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();

        for (String s : strings) {
            String first = s.substring(0, 1);
            if (map.containsKey(first)) {
                map.put(first, map.get(first) + s);
            } else {
                map.put(first, s);
            }
        }

        return map;
    }

    public static void main(String[] args) {
        FirstChar fc = new FirstChar();

        // Test 1: ["salt", "tea", "soda", "toast"]
        String[] s1 = {"salt", "tea", "soda", "toast"};
        System.out.println(fc.firstChar(s1)); // {s=saltsoda, t=teatoast}

        // Test 2: ["aa", "bb", "cc", "aAA", "cCC", "d"]
        String[] s2 = {"aa", "bb", "cc", "aAA", "cCC", "d"};
        System.out.println(fc.firstChar(s2)); // {a=aaaAA, b=bb, c=cccCC, d=d}

        // Test 3: []
        String[] s3 = {};
        System.out.println(fc.firstChar(s3)); // {}
    }
}
