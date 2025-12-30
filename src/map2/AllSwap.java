package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: allSwap
 *
 * We'll say that 2 strings "match" if they are non-empty and their first 
 * chars are the same. Loop over the given array of strings and swap 
 * the first matching string seen with the next matching string seen 
 * and so on. Any string can only be swapped at most once.
 */
public class AllSwap {

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {
                String first = strings[i].substring(0, 1);
                if (map.containsKey(first)) {
                    String temp = strings[i];
                    strings[i] = strings[map.get(first)];
                    strings[map.get(first)] = temp;
                    map.remove(first);
                } else {
                    map.put(first, i);
                }
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        AllSwap as = new AllSwap();

        // Test 1
        String[] s1 = {"ab", "ac"};
        String[] res1 = as.allSwap(s1);
        System.out.println(java.util.Arrays.toString(res1)); // [ac, ab]

        // Test 2
        String[] s2 = {"ax", "bx", "ay", "by", "ai", "aj"};
        String[] res2 = as.allSwap(s2);
        System.out.println(java.util.Arrays.toString(res2)); // [ay, by, ax, bx, aj, ai]

        // Test 3
        String[] s3 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        String[] res3 = as.allSwap(s3);
        System.out.println(java.util.Arrays.toString(res3)); // [ay, by, cy, cx, bx, ax, azz, aaa]
    }
}
