package array2;

/**
 * CodingBat - Array-2: lucky13
 *
 * Return true if the array contains no 1's and no 3's.
 */
public class Lucky13 {

    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Lucky13 l = new Lucky13();

        System.out.println(l.lucky13(new int[]{0, 2, 4}));     // true
        System.out.println(l.lucky13(new int[]{1, 2, 3}));     // false
        System.out.println(l.lucky13(new int[]{2, 2, 2}));     // true
        System.out.println(l.lucky13(new int[]{3}));           // false
        System.out.println(l.lucky13(new int[]{}));            // true
    }
}
