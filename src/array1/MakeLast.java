package array1;

/**
 * CodingBat - Array-1: makeLast
 *
 * Given an int array, return a new array double the length,
 * where the last element is the same as the last element of the original array.
 * All other elements are 0 by default.
 */
public class MakeLast {

    public int[] makeLast(int[] nums) {
        int len = nums.length;
        int[] ans = new int[2 * len];
        ans[ans.length - 1] = nums[len - 1];
        return ans;
    }

    public static void main(String[] args) {
        MakeLast m = new MakeLast();

        int[] r1 = m.makeLast(new int[]{4, 5, 6}); // [0,0,0,0,0,6]
        int[] r2 = m.makeLast(new int[]{1});       // [0,1]
        int[] r3 = m.makeLast(new int[]{3, 9});    // [0,0,0,9]

        System.out.println(java.util.Arrays.toString(r1));
        System.out.println(java.util.Arrays.toString(r2));
        System.out.println(java.util.Arrays.toString(r3));
    }
}
