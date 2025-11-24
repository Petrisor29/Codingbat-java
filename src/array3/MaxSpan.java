package array3;

/**
 * CodingBat - MaxSpan
 *
 * Return the largest span in the array.
 * The span is defined as the distance between the first and last appearance
 * of a value: lastIndex - firstIndex + 1.
 */
public class MaxSpan {

    public int maxSpan(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int last = i;

            // find last occurrence of nums[i]
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    last = j;
                    break;
                }
            }

            int span = last - i + 1;
            if (span > max) {
                max = span;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        MaxSpan m = new MaxSpan();

        System.out.println(m.maxSpan(new int[]{1, 2, 1, 1, 3})); // 4
        System.out.println(m.maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4})); // 6
        System.out.println(m.maxSpan(new int[]{1, 2, 3, 4})); // 1
        System.out.println(m.maxSpan(new int[]{})); // 0
    }
}
