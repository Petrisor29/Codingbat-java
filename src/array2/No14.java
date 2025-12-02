package array2;

/**
 * CodingBat - Array-2: no14
 *
 * Return true if the array contains no both 1 and 4.
 * (It is allowed to contain only 1s, only 4s, or neither.)
 */
public class No14 {

    public boolean no14(int[] nums) {
        boolean is1 = false;
        boolean is4 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) is1 = true;
            if (nums[i] == 4) is4 = true;
        }

        return !(is1 && is4);
    }

    public static void main(String[] args) {
        No14 n = new No14();

        System.out.println(n.no14(new int[]{1, 2, 3}));    // true (no 4)
        System.out.println(n.no14(new int[]{2, 3, 4}));    // true (no 1)
        System.out.println(n.no14(new int[]{1, 2, 4}));    // false (contains both)
        System.out.println(n.no14(new int[]{2, 2, 2}));    // true
        System.out.println(n.no14(new int[]{1, 1, 1}));    // true
        System.out.println(n.no14(new int[]{4, 4, 4}));    // true
    }
}
