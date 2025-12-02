package array2;

/**
 * CodingBat - Array-2: only14
 *
 * Return true if every element in the array is either 1 or 4.
 */
public class Only14 {

    public boolean only14(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) count++;
        }

        return count == 0;
    }

    public static void main(String[] args) {
        Only14 o = new Only14();

        System.out.println(o.only14(new int[]{1, 4, 1, 4})); // true
        System.out.println(o.only14(new int[]{1, 4, 2, 4})); // false
        System.out.println(o.only14(new int[]{1, 1}));       // true
        System.out.println(o.only14(new int[]{4, 1, 4}));    // true
        System.out.println(o.only14(new int[]{1, 3, 4}));    // false
    }
}
