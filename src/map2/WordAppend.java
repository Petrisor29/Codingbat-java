package map2;

import java.util.Map;
import java.util.HashMap;

/**
 * CodingBat - Map-2: wordAppend
 *
 * Loop over the given array of strings to build a result string like this: 
 * when a string appears the 2nd, 4th, 6th, etc. time in the array, 
 * append the string to the result. Return the empty string if no 
 * string appears a 2nd time.
 */
public class WordAppend {

    public String wordAppend(String[] strings) {
        StringBuilder result = new StringBuilder();
        Map<String, Integer> counts = new HashMap<>();

        for (String s : strings) {
            // Incrementăm contorul pentru fiecare apariție
            int count = counts.getOrDefault(s, 0) + 1;
            counts.put(s, count);

            // Dacă este a 2-a, a 4-a, etc. apariție, adăugăm la rezultat
            if (count % 2 == 0) {
                result.append(s);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        WordAppend wa = new WordAppend();

        // Test 1: ["a", "b", "a"] -> "a" apare de 2 ori
        String[] s1 = {"a", "b", "a"};
        System.out.println(wa.wordAppend(s1)); // "a"

        // Test 2: ["a", "b", "a", "c", "a", "d", "a"] -> "a" apare de 4 ori
        String[] s2 = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(wa.wordAppend(s2)); // "aa"

        // Test 3: ["a", "", "a"] -> "" nu se repetă, "a" da
        String[] s3 = {"a", "", "a"};
        System.out.println(wa.wordAppend(s3)); // "a"

        // Test 4: ["not", "any", "test", "not", "any"]
        String[] s4 = {"not", "any", "test", "not", "any"};
        System.out.println(wa.wordAppend(s4)); // "notany"
    }
}
