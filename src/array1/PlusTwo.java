package array1;

/**
 * CodingBat - Array-1: plusTwo
 *
 * Given 2 int arrays a and b, each length 2, return a new array
 * length 4 containing all their elements.
 */
public class PlusTwo {

    public int[] plusTwo(int[] a, int[] b) {
        int[] plus = {a[0], a[1], b[0], b[1]};
        return plus;
    }

    public static void main(String[] args) {
        PlusTwo p = new PlusTwo();

        System.out.println(java.util.Arrays.toString(
            p.plusTwo(new int[]{1, 2}, new int[]{3, 4})
        )); // [1, 2, 3, 4]

        System.out.println(java.util.Arrays.toString(
            p.plusTwo(new int[]{5, 6}, new int[]{7, 8})
        )); // [5, 6, 7, 8]
    }
}
