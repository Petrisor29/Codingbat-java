package ap1;

/**
 * CodingBat - AP-1: copyEvens
 *
 * Return a new array of length 'count' containing
 * the first 'count' even numbers from nums[].
 */
public class CopyEvens {

    public int[] copyEvens(int[] nums, int count) {
        int[] evens = new int[count];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0 && idx < count) {
                evens[idx++] = nums[i];
            }
        }

        return evens;
    }

    public static void main(String[] args) {
        CopyEvens c = new CopyEvens();

        print(c.copyEvens(new int[]{3, 2, 4, 5, 8}, 2)); // [2, 4]
        print(c.copyEvens(new int[]{3, 2, 4, 5, 8}, 3)); // [2, 4, 8]
        print(c.copyEvens(new int[]{1, 3, 5}, 0));       // []
        print(c.copyEvens(new int[]{2, 2, 2, 2}, 4));    // [2, 2, 2, 2]
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
