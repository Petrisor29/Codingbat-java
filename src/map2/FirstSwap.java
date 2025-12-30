package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: firstSwap
 *
 * Regardless of how many times a character appears, only the first 
 * instance of that character can ever be swapped, and only with 
 * the second instance.
 */
public class FirstSwap {

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("")) {
                String first = strings[i].substring(0, 1);
                
                if (map.containsKey(first)) {
                    // Verificăm dacă nu a fost deja marcat cu -1
                    if (map.get(first) != -1) {
                        String temp = strings[i];
                        strings[i] = strings[map.get(first)];
                        strings[map.get(first)] = temp;
                        // Marcăm caracterul ca "swapped" definitiv
                        map.put(first, -1);
                    }
                } else {
                    // Punem indexul doar dacă e prima dată când vedem caracterul
                    map.put(first, i);
                }
            }
        }

        return strings;
    }

    public static void main(String[] args) {
        FirstSwap fs = new FirstSwap();

        // Test 1: ["ab", "ac"] -> ["ac", "ab"]
        String[] s1 = {"ab", "ac"};
        System.out.println(java.util.Arrays.toString(fs.firstSwap(s1)));

        // Test 2: ["ax", "bx", "ay", "by", "ai", "aj"] -> ["ay", "by", "ax", "bx", "ai", "aj"]
        // "ai" și "aj" NU trebuie să facă swap pentru că "a" a făcut deja
        String[] s2 = {"ax", "bx", "ay", "by", "ai", "aj"};
        System.out.println(java.util.Arrays.toString(fs.firstSwap(s2)));

        // Test 3: ["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]
        String[] s3 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(java.util.Arrays.toString(fs.firstSwap(s3)));
    }
}
