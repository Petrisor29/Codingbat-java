package array2;

/**
 * CodingBat - Array-2: centeredAverage
 *
 * Return the "centered" average of an array of ints, which is the mean
 * average of the values, excluding the largest and smallest values in the array.
 * You may assume that the array is length 3 or more.
 */
public class CenteredAverage {

    public int centeredAverage(int[] nums) {
        int sum = 0;
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
            sum += nums[i];
        }

        return (sum - min - max) / (nums.length - 2);
    }

    public static void main(String[] args) {
        CenteredAverage ca = new CenteredAverage();

        System.out.println(ca.centeredAverage(new int[]{1, 2, 3, 4, 100}));  // 3
        System.out.println(ca.centeredAverage(new int[]{1, 1, 5, 5, 10, 8, 7})); // 5
        System.out.println(ca.centeredAverage(new int[]{-10, -4, -2, -4, -2, 0})); // -3
        System.out.println(ca.centeredAverage(new int[]{2, 3, 4})); // 3
    }
}
