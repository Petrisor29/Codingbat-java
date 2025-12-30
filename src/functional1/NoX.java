package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: noX
 *
 * Given a list of strings, return a list where each string has 
 * all its "x" removed.
 */
public class NoX {

    public List<String> noX(List<String> strings) {
        // Corect: replaceAll actualizează lista cu noile referințe String
        strings.replaceAll(s -> s.replace("x", ""));
        
        return strings;
    }

    public static void main(String[] args) {
        NoX nx = new NoX();

        // Test 1: ["ax", "bb", "cx"] -> ["a", "bb", "c"]
        List<String> list1 = new ArrayList<>(Arrays.asList("ax", "bb", "cx"));
        System.out.println(nx.noX(list1));

        // Test 2: ["xxax", "xbxbx", "xxcx"] -> ["a", "bb", "c"]
        List<String> list2 = new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"));
        System.out.println(nx.noX(list2));
    }
}
