package array2;

/**
 * CodingBat - Array-2: sum13
 *
 * Return the sum of the numbers in the array,
 * skipping any number that is 13 and the number immediately after it.
 */
public class Sum13 {

    public int sum13(int[] nums) {
        int sum = 0;
        if (nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++; // skip the number after 13
            } else {
                sum += nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum13 s = new Sum13();

        System.out.println(s.sum13(new int[]{1, 2, 2, 1}));        // 6
        System.out.println(s.sum13(new int[]{1, 1}));              // 2
        System.out.println(s.sum13(new int[]{1, 2, 2, 1, 13}));    // 6
        System.out.println(s.sum13(new int[]{1, 13, 2}));          // 1 (13 and 2 skipped)
        System.out.println(s.sum13(new int[]{13, 1, 13, 5}));      // 5
        System.out.println(s.sum13(new int[]{}));                  // 0
    }
}
