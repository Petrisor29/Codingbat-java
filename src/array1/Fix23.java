package array1;

/**
 * CodingBat - Array-1: fix23
 *
 * Given an int array length 3, if there is a 2 followed by a 3,
 * set the 3 to 0.
 */
public class Fix23 {

    public int[] fix23(int[] num) {
        if (num[0] == 2 && num[1] == 3) num[1] = 0;
        if (num[1] == 2 && num[2] == 3) num[2] = 0;

        return num;
    }

    public static void main(String[] args) {
        Fix23 f = new Fix23();

        System.out.println(java.util.Arrays.toString(f.fix23(new int[]{1, 2, 3}))); // [1, 2, 0]
        System.out.println(java.util.Arrays.toString(f.fix23(new int[]{2, 3, 5}))); // [2, 0, 5]
        System.out.println(java.util.Arrays.toString(f.fix23(new int[]{2, 3, 3}))); // [2, 0, 3]
        System.out.println(java.util.Arrays.toString(f.fix23(new int[]{1, 1, 1}))); // [1, 1, 1]
    }
}
