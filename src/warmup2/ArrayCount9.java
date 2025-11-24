package array1;

/**
 * CodingBat - Array-1: arrayCount9
 *
 * Given an array of ints, return the number of 9's in the array.
 */
public class ArrayCount9 {

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayCount9 ac9 = new ArrayCount9();

        System.out.println(ac9.arrayCount9(new int[]{1, 2, 9}));           // 1
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9}));           // 2
        System.out.println(ac9.arrayCount9(new int[]{1, 9, 9, 3, 9}));     // 3
        System.out.println(ac9.arrayCount9(new int[]{1, 2, 3}));           // 0
        System.out.println(ac9.arrayCount9(new int[]{}));                  // 0
    }
}
