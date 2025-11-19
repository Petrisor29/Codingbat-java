package array2;

/**
 * CodingBat - Array-2: bigDiff
 *
 * Given an array of ints, return the difference between the largest
 * and smallest values in the array.
 */
public class BigDiff {

    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }

        return max - min;
    }

    public static void main(String[] args) {
        BigDiff bd = new BigDiff();

        System.out.println(bd.bigDiff(new int[]{10, 3, 5, 6}));    // 7
        System.out.println(bd.bigDiff(new int[]{7, 2, 10, 9}));    // 8
        System.out.println(bd.bigDiff(new int[]{2, 10, 7, 2}));    // 8
        System.out.println(bd.bigDiff(new int[]{1, 1, 1, 1}));     // 0
        System.out.println(bd.bigDiff(new int[]{6, 0, 6, 0}));     // 6
    }
}
