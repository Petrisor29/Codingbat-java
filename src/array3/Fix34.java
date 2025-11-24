package array3;

/**
 * CodingBat - Array-3: fix34
 *
 * Return an array that rearranges the 4's so that every 3 is immediately
 * followed by a 4. 3's stay in place, 4's move.
 */
public class Fix34 {

    public int[] fix34(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 3) {

                for (int j = 0; j < nums.length; j++) {
                    // gasim un 4 care nu este deja dupa un 3
                    if (nums[j] == 4 && j > 0 && nums[j - 1] != 3) {

                        int temp = nums[j];
                        nums[j] = nums[i + 1];
                        nums[i + 1] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Fix34 f = new Fix34();

        print(f.fix34(new int[]{1, 3, 1, 4}));              // [1, 3, 4, 1]
        print(f.fix34(new int[]{1, 3, 1, 4, 4, 3, 1}));     // [1,3,4,1,1,3,4]
        print(f.fix34(new int[]{3, 2, 2, 4}));              // [3,4,2,2]
        print(f.fix34(new int[]{3, 2, 4, 3, 2, 4}));        // [3,4,2,3,4,2]
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
