package warmup2;

/**
 * CodingBat - Warmup-2: arrayFront9
 *
 * Return true if the array contains a 9 among the first 4 elements.
 * The array length may be less than 4.
 */
public class ArrayFront9 {

    public boolean arrayFront9(int[] nums) {
        if (nums.length < 4) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 9) return true;
            }
        } else {
            for (int i = 0; i <= 3; i++) {
                if (nums[i] == 9) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayFront9 af9 = new ArrayFront9();

        System.out.println(af9.arrayFront9(new int[]{1, 2, 9, 3, 4})); // true
        System.out.println(af9.arrayFront9(new int[]{1, 2, 3, 4, 9})); // false
        System.out.println(af9.arrayFront9(new int[]{9, 1, 2}));       // true
        System.out.println(af9.arrayFront9(new int[]{1, 1, 1, 1}));    // false
        System.out.println(af9.arrayFront9(new int[]{}));              // false
    }
}
