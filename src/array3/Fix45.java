package array3;

/**
 * CodingBat - Array-3: fix45
 *
 * Return an array where every 4 is followed immediately by a 5.
 * 4's stay in position, 5's move.
 */
public class Fix45 {

    public int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 4) {

                for (int j = 0; j < nums.length; j++) {
                    // găsim un 5 care NU este deja după un 4
                    if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Fix45 f = new Fix45();

        print(f.fix45(new int[]{5, 4, 9, 4, 9, 5}));              // [9,4,5,4,5,9]
        print(f.fix45(new int[]{1, 4, 1, 5}));                    // [1,4,5,1]
        print(f.fix45(new int[]{4, 2, 2, 5}));                    // [4,5,2,2]
        print(f.fix45(new int[]{4, 5, 4, 5}));                    // [4,5,4,5]
        print(f.fix45(new int[]{5, 4, 5, 4, 1}));                 // [1,4,5,4,5]
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
