package array3;

/**
 * CodingBat - Array-3: canBalance
 *
 * Return true if there is a place to split the array so that
 * the sum of the left part equals the sum of the right part.
 */
public class CanBalance {

    public boolean canBalance(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int sum1 = 0;
            for (int j = 0; j < i; j++) {
                sum1 += nums[j];
            }

            int sum2 = 0;
            for (int k = i; k < nums.length; k++) {
                sum2 += nums[k];
            }

            if (sum1 == sum2) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        CanBalance cb = new CanBalance();

        System.out.println(cb.canBalance(new int[]{1, 1, 1, 2, 1})); // true
        System.out.println(cb.canBalance(new int[]{2, 1, 1, 2, 1})); // false
        System.out.println(cb.canBalance(new int[]{10, 10}));         // true
        System.out.println(cb.canBalance(new int[]{1, 2, 3, 4, 6}));  // true
        System.out.println(cb.canBalance(new int[]{1, 2, 3}));        // false
    }
}
