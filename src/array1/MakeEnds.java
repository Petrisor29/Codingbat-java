package array1;

/**
 * CodingBat - Array-1: makeEnds
 *
 * Given an array of ints, return a new array of length 2
 * containing the first and last elements from the original array.
 */
public class MakeEnds {

    public int[] makeEnds(int[] nums) {
        int[] ans = { nums[0], nums[nums.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        MakeEnds m = new MakeEnds();

        print(m.makeEnds(new int[]{1, 2, 3}));     // [1, 3]
        print(m.makeEnds(new int[]{1, 2, 3, 4}));  // [1, 4]
        print(m.makeEnds(new int[]{7}));           // [7, 7]
    }

    private static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
