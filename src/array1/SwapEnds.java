package array1;

/**
 * CodingBat - Array-1: swapEnds
 *
 * Given an array of any length, swap the first and last elements.
 */
public class SwapEnds {

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;

        return nums;
    }

    public static void main(String[] args) {
        SwapEnds s = new SwapEnds();

        System.out.println(java.util.Arrays.toString(
            s.swapEnds(new int[]{1, 2, 3, 4})
        )); // [4, 2, 3, 1]

        System.out.println(java.util.Arrays.toString(
            s.swapEnds(new int[]{7, 2, 3})
        )); // [3, 2, 7]

        System.out.println(java.util.Arrays.toString(
            s.swapEnds(new int[]{5})
        )); // [5]
    }
}
