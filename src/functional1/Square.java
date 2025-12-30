package functional1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * CodingBat - Functional-1: square
 *
 * Given a list of integers, return a list where each integer is 
 * multiplied with itself.
 */
public class Square {

    public List<Integer> square(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }

    public static void main(String[] args) {
        Square sq = new Square();

        // Test 1: [1, 2, 3] -> [1, 4, 9]
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(sq.square(nums1));

        // Test 2: [6, 8, -6, -8, 1] -> [36, 64, 36, 64, 1]
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(6, 8, -6, -8, 1));
        System.out.println(sq.square(nums2));

        // Test 3: [] -> []
        List<Integer> nums3 = new ArrayList<>();
        System.out.println(sq.square(nums3));
    }
}
