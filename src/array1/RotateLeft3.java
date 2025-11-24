package array1;

/**
 * CodingBat - Array-1: rotateLeft3
 *
 * Given an array of 3 ints, return a new array with the elements
 * rotated to the left, e.g. {1,2,3} → {2,3,1}.
 */
public class RotateLeft3 {

    public int[] rotateLeft3(int[] nums) {
        int[] rotate = {nums[1], nums[2], nums[0]};
        return rotate;
    }

    public static void main(String[] args) {
        RotateLeft3 rl3 = new RotateLeft3();

        int[] r1 = rl3.rotateLeft3(new int[]{1, 2, 3}); // {2, 3, 1}
        int[] r2 = rl3.rotateLeft3(new int[]{5, 11, 9}); // {11, 9, 5}
        int[] r3 = rl3.rotateLeft3(new int[]{7, 0, 0});  // {0, 0, 7}

        System.out.println("{" + r1[0] + ", " + r1[1] + ", " + r1[2] + "}");
        System.out.println("{" + r2[0] + ", " + r2[1] + ", " + r2[2] + "}");
        System.out.println("{" + r3[0] + ", " + r3[1] + ", " + r3[2] + "}");
    }
}
