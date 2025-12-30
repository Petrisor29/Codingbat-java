package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: rightDigit
 *
 * Given a list of non-negative integers, return an integer list of the 
 * rightmost digits. (Note: use %)
 */
public class RightDigit {

    public List<Integer> rightDigit(List<Integer> nums) {
        // Extragem ultima cifră folosind operatorul modulo 10
        nums.replaceAll(n -> n % 10);
        
        return nums;
    }

    public static void main(String[] args) {
        RightDigit rd = new RightDigit();

        // Test 1: [1, 22, 93] -> [1, 2, 3]
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 22, 93));
        System.out.println(rd.rightDigit(nums1));

        // Test 2: [16, 8, 886, 8, 1] -> [6, 8, 6, 8, 1]
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(16, 8, 886, 8, 1));
        System.out.println(rd.rightDigit(nums2));

        // Test 3: [10, 0] -> [0, 0]
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(10, 0));
        System.out.println(rd.rightDigit(nums3));
    }
}
