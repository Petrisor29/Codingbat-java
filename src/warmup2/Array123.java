package warmup2;

/**
 * CodingBat - Warmup-2: array123
 *
 * Return true if the sequence 1, 2, 3 appears in the array.
 */
public class Array123 {

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Array123 a123 = new Array123();

        System.out.println(a123.array123(new int[]{1, 1, 2, 3, 1})); // true
        System.out.println(a123.array123(new int[]{1, 1, 2, 4, 1})); // false
        System.out.println(a123.array123(new int[]{1, 2, 3}));       // true
        System.out.println(a123.array123(new int[]{0, 1, 2, 3, 4})); // true
        System.out.println(a123.array123(new int[]{2, 3, 4}));       // false
    }
}
