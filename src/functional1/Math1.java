package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: math1
 *
 * Given a list of integers, return a list where each integer is added 
 * to 1 and the result is multiplied by 10.
 */
public class Math1 {

    public List<Integer> math1(List<Integer> nums) {
        // (n + 1) * 10 aplicat fiecărui element
        nums.replaceAll(n -> (n + 1) * 10);
        
        return nums;
    }

    public static void main(String[] args) {
        Math1 m1 = new Math1();

        // Test 1: [1, 2, 3] -> [20, 30, 40]
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(m1.math1(nums1));

        // Test 2: [6, 8, 1, 8, -1] -> [70, 90, 20, 90, 0]
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(6, 8, 1, 8, -1));
        System.out.println(m1.math1(nums2));

        // Test 3: [-2, -1, 0] -> [-10, 0, 10]
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(-2, -1, 0));
        System.out.println(m1.math1(nums3));
    }
}
