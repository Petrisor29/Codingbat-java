package array1;

/**
 * CodingBat - Array-1: reverse3
 *
 * Given an array of 3 ints, return a new array with the elements
 * in reverse order.
 */
public class Reverse3 {

    public int[] reverse3(int[] nums) {
        return new int[]{nums[2], nums[1], nums[0]};
    }

    public static void main(String[] args) {
        Reverse3 r3 = new Reverse3();

        int[] a = r3.reverse3(new int[]{1, 2, 3});   // {3, 2, 1}
        int[] b = r3.reverse3(new int[]{5, 11, 9});  // {9, 11, 5}
        int[] c = r3.reverse3(new int[]{7, 0, 0});   // {0, 0, 7}

        System.out.println("{" + a[0] + ", " + a[1] + ", " + a[2] + "}");
        System.out.println("{" + b[0] + ", " + b[1] + ", " + b[2] + "}");
        System.out.println("{" + c[0] + ", " + c[1] + ", " + c[2] + "}");
    }
}
