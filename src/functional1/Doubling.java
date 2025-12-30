package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: doubling
 *
 * Given a list of integers, return a list where each integer is multiplied by 2.
 */
public class Doubling {

    public List<Integer> doubling(List<Integer> nums) {
        // Folosim replaceAll cu o lambda expression pentru a dubla fiecare element
        nums.replaceAll(n -> n * 2);
        
        return nums;
    }

    public static void main(String[] args) {
        Doubling d = new Doubling();

        // Test 1: [1, 2, 3] -> [2, 4, 6]
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(d.doubling(nums1));

        // Test 2: [6, 8, 1, 1, -1] -> [12, 16, 2, 2, -2]
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(6, 8, 1, 1, -1));
        System.out.println(d.doubling(nums2));

        // Test 3: [] -> []
        List<Integer> nums3 = new ArrayList<>(Arrays.asList());
        System.out.println(d.doubling(nums3));
    }
}
