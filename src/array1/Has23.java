package array1;

/**
 * CodingBat - Array-1: has23
 *
 * Given an int array length 2, return true if it contains a 2 or a 3.
 */
public class Has23 {

    public boolean has23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3) return true;
        if (nums[1] == 2 || nums[1] == 3) return true;
        return false;
    }

    public static void main(String[] args) {
        Has23 h = new Has23();

        System.out.println(h.has23(new int[]{2, 5})); // true
        System.out.println(h.has23(new int[]{4, 3})); // true
        System.out.println(h.has23(new int[]{4, 5})); // false
        System.out.println(h.has23(new int[]{3, 2})); // true
        System.out.println(h.has23(new int[]{1, 1})); // false
    }
}
