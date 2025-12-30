package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: lower
 *
 * Given a list of strings, return a list where each string is converted 
 * to lower case (Note: String toLowerCase() method).
 */
public class Lower {

    public List<String> lower(List<String> strings) {
        // Transformăm fiecare șir s în varianta sa cu litere mici
        strings.replaceAll(s -> s.toLowerCase());
        
        return strings;
    }

    public static void main(String[] args) {
        Lower l = new Lower();

        // Test 1: ["Hello", "Hi"] -> ["hello", "hi"]
        List<String> list1 = new ArrayList<>(Arrays.asList("Hello", "Hi"));
        System.out.println(l.lower(list1));

        // Test 2: ["AAA", "bbb", "ccc"] -> ["aaa", "bbb", "ccc"]
        List<String> list2 = new ArrayList<>(Arrays.asList("AAA", "bbb", "ccc"));
        System.out.println(l.lower(list2));

        // Test 3: ["Kittens", "and", "Chocolate"] -> ["kittens", "and", "chocolate"]
        List<String> list3 = new ArrayList<>(Arrays.asList("Kittens", "and", "Chocolate"));
        System.out.println(l.lower(list3));
    }
}
