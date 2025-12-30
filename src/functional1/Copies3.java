package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: copies3
 *
 * Given a list of strings, return a list where each string is replaced 
 * by 3 copies of itself concatenated together.
 */
public class Copies3 {

    public List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        
        return strings;
    }

    public static void main(String[] args) {
        Copies3 c3 = new Copies3();

        // Test 1: ["a", "bb", "ccc"] -> ["aaa", "bbbbbb", "ccccccccc"]
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        System.out.println(c3.copies3(list1));

        // Test 2: ["24", "a", ""] -> ["242424", "aaa", ""]
        List<String> list2 = new ArrayList<>(Arrays.asList("24", "a", ""));
        System.out.println(c3.copies3(list2));

        // Test 3: ["hello"] -> ["hellohellohello"]
        List<String> list3 = new ArrayList<>(Arrays.asList("hello"));
        System.out.println(c3.copies3(list3));
    }
}
