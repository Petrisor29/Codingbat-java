package array2;

/**
 * CodingBat - Array-2: more14
 *
 * Return true if the number of 1's is greater than
 * the number of 4's in the array.
 */
public class More14 {

    public boolean more14(int[] nums) {
        int count_1 = 0;
        int count_4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count_1++;
            if (nums[i] == 4) count_4++;
        }

        return count_1 > count_4;
    }

    public static void main(String[] args) {
        More14 m = new More14();

        System.out.println(m.more14(new int[]{1, 4, 1}));        // true
        System.out.println(m.more14(new int[]{1, 4, 1, 4}));     // false
        System.out.println(m.more14(new int[]{1, 1}));           // true
        System.out.println(m.more14(new int[]{4, 4, 4}));        // false
        System.out.println(m.more14(new int[]{1, 2, 3, 1, 4}));  // true
    }
}
