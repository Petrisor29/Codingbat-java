package array1;

/**
 * CodingBat - Array-1: midThree
 *
 * Given an array of odd length, return a new array of length 3
 * containing the middle three elements.
 */
public class MidThree {

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public static void main(String[] args) {
        MidThree m = new MidThree();

        System.out.println(java.util.Arrays.toString(
            m.midThree(new int[]{1, 2, 3, 4, 5})
        )); // [2, 3, 4]

        System.out.println(java.util.Arrays.toString(
            m.midThree(new int[]{8, 6, 7, 5, 3, 0, 9})
        )); // [7, 5, 3]

        System.out.println(java.util.Arrays.toString(
            m.midThree(new int[]{1, 2, 3})
        )); // [1, 2, 3]
    }
}
