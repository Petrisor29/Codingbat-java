package array1;

/**
 * CodingBat - Array-1: double23
 *
 * Return true if the array contains two 2's or two 3's.
 */
public class Double23 {

    public boolean double23(int[] nums) {
        if (nums.length <= 1) return false;

        if (nums[0] == 2 && nums[1] == 2) return true;
        if (nums[0] == 3 && nums[1] == 3) return true;

        return false;
    }

    public static void main(String[] args) {
        Double23 d = new Double23();

        System.out.println(d.double23(new int[]{2, 2})); // true
        System.out.println(d.double23(new int[]{3, 3})); // true
        System.out.println(d.double23(new int[]{2, 3})); // false
        System.out.println(d.double23(new int[]{3}));    // false
        System.out.println(d.double23(new int[]{}));     // false
    }
}
