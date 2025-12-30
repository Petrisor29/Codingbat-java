package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: addStar
 *
 * Given a list of strings, return a list where each string has "*" 
 * added at its end.
 */
public class AddStar {

    public List<String> addStar(List<String> strings) {
        // Concatenăm "*" la fiecare element n din listă
        strings.replaceAll(n -> n + "*");
        
        return strings;
    }

    public static void main(String[] args) {
        AddStar as = new AddStar();

        // Test 1: ["a", "bb", "ccc"] -> ["a*", "bb*", "ccc*"]
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "bb", "ccc"));
        System.out.println(as.addStar(list1));

        // Test 2: ["hello", "there"] -> ["hello*", "there*"]
        List<String> list2 = new ArrayList<>(Arrays.asList("hello", "there"));
        System.out.println(as.addStar(list2));

        // Test 3: ["*"] -> ["**"]
        List<String> list3 = new ArrayList<>(Arrays.asList("*"));
        System.out.println(as.addStar(list3));
    }
}
