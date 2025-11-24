package array1;

/**
 * CodingBat - Array-1: maxEnd3
 *
 * Given an array of 3 ints, figure out which is larger,
 * the first or the last element, and set all elements to that value.
 */
public class MaxEnd3 {

    public int[] maxEnd3(int[] nums) {
        int max = 0;
        if (nums[0] > nums[2]) {
            max = nums[0];
        } else {
            max = nums[2];
        }
        return new int[]{max, max, max};
    }

    public static void main(String[] args) {
        MaxEnd3 me3 = new MaxEnd3();

        int[] r1 = me3.maxEnd3(new int[]{1, 2, 3});   // {3, 3, 3}
        int[] r2 = me3.maxEnd3(new int[]{11, 5, 9});  // {11, 11, 11}
        int[] r3 = me3.maxEnd3(new int[]{2, 11, 3});  // {3, 3, 3}

        System.out.println("{" + r1[0] + ", " + r1[1] + ", " + r1[2] + "}");
        System.out.println("{" + r2[0] + ", " + r2[1] + ", " + r2[2] + "}");
        System.out.println("{" + r3[0] + ", " + r3[1] + ", " + r3[2] + "}");
    }
}
