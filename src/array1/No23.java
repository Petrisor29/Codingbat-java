package array1;

/**
 * CodingBat - Array-1: no23
 *
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */
public class No23 {

    public boolean no23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3) return false;
        if (nums[1] == 2 || nums[1] == 3) return false;

        return true;
    }

    public static void main(String[] args) {
        No23 n = new No23();

        System.out.println(n.no23(new int[]{4, 5})); // true
        System.out.println(n.no23(new int[]{4, 2})); // false
        System.out.println(n.no23(new int[]{3, 5})); // false
        System.out.println(n.no23(new int[]{1, 9})); // true
    }
}
