package ap1;

/**
 * CodingBat - AP-1: copyEndy
 *
 * Return a new array of length 'count' containing
 * the first 'count' endy numbers from nums[].
 *
 * Endy numbers are:
 * - 0..10
 * - 90..100
 */
public class CopyEndy {

    public int[] copyEndy(int[] nums, int count) {
        int[] endyNums = new int[count];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (isEndy(nums[i]) && index < count) {
                endyNums[index++] = nums[i];
            }
        }

        return endyNums;
    }

    public boolean isEndy(int n) {
        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) return true;
        return false;
    }

    public static void main(String[] args) {
        CopyEndy c = new CopyEndy();

        print(c.copyEndy(new int[]{9, 11, 90, 22, 6}, 2));  // [9, 90]
        print(c.copyEndy(new int[]{9, 11, 90, 22, 6}, 3));  // [9, 90, 6]
        print(c.copyEndy(new int[]{12, 13, 14}, 1));        // []
        print(c.copyEndy(new int[]{0, 100, 5, 95}, 4));     // [0, 100, 5, 95]
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
