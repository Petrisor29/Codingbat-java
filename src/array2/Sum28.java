package array2;

/**
 * CodingBat - Array-2: sum28
 *
 * Return true if the sum of all the 2's in the array is exactly 8.
 */
public class Sum28 {

    public boolean sum28(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                sum += nums[i];
            }
        }
        return sum == 8;
    }

    public static void main(String[] args) {
        Sum28 s = new Sum28();

        System.out.println(s.sum28(new int[]{2, 3, 2, 2, 4, 2})); // true (2+2+2+2=8)
        System.out.println(s.sum28(new int[]{2, 2, 2, 2}));       // true
        System.out.println(s.sum28(new int[]{2, 2, 2}));          // false (6)
        System.out.println(s.sum28(new int[]{1, 2, 3, 4}));       // false (2)
        System.out.println(s.sum28(new int[]{}));                 // false (0)
    }
}
