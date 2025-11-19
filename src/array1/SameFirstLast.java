package array1;

/**
 * CodingBat - Array-1: sameFirstLast
 *
 * Given an array of ints, return true if the array is length 1 or more
 * and the first element and the last element are the same.
 */
public class SameFirstLast {

    public boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        if (len >= 1 && nums[0] == nums[len - 1]) return true;
        return false;
    }

    public static void main(String[] args) {
        SameFirstLast sfl = new SameFirstLast();

        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 3}));     // false
        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 3, 1})); // true
        System.out.println(sfl.sameFirstLast(new int[]{1, 2, 1}));    // true
        System.out.println(sfl.sameFirstLast(new int[]{7}));          // true
        System.out.println(sfl.sameFirstLast(new int[]{}));           // false
    }
}
