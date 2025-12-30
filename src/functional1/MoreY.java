package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: moreY
 *
 * Given a list of strings, return a list where each string has "y" 
 * added at its start and end.
 */
public class MoreY {

    public List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        
        return strings;
    }

    public static void main(String[] args) {
        MoreY my = new MoreY();

        // Test 1: ["a", "b", "c"] -> ["yay", "yby", "ycy"]
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        System.out.println(my.moreY(list1));

        // Test 2: ["hello", "there"] -> ["yhelloy", "ytherey"]
        List<String> list2 = new ArrayList<>(Arrays.asList("hello", "there"));
        System.out.println(my.moreY(list2));

        // Test 3: [""] -> ["yy"]
        List<String> list3 = new ArrayList<>(Arrays.asList(""));
        System.out.println(my.moreY(list3));
    }
}
