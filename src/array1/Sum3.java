package array1;

/**
 * CodingBat - Array-1: sum3
 *
 * Given an array of 3 ints, return the sum of the numbers.
 */
public class Sum3 {

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public static void main(String[] args) {
        Sum3 s3 = new Sum3();

        System.out.println(s3.sum3(new int[]{1, 2, 3}));  // 6
        System.out.println(s3.sum3(new int[]{5, 11, 2})); // 18
        System.out.println(s3.sum3(new int[]{7, 0, 0}));  // 7
        System.out.println(s3.sum3(new int[]{3, 3, 3}));  // 9
    }
}
