package array1;

/**
 * CodingBat - Array-1: makeMiddle
 *
 * Given an array of even length, return a new array of length 2
 * containing the middle two elements.
 */
public class MakeMiddle {

    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    public static void main(String[] args) {
        MakeMiddle m = new MakeMiddle();

        System.out.println(java.util.Arrays.toString(
            m.makeMiddle(new int[]{1, 2, 3, 4})
        )); // [2, 3]

        System.out.println(java.util.Arrays.toString(
            m.makeMiddle(new int[]{7, 1, 2, 3, 4, 9})
        )); // [2, 3]

        System.out.println(java.util.Arrays.toString(
            m.makeMiddle(new int[]{1, 2})
        )); // [1, 2] (edge case)
    }
}
