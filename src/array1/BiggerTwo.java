package array1;

/**
 * CodingBat - Array-1: biggerTwo
 *
 * Given 2 int arrays of length 2, return the array with the larger sum.
 * If the sums are equal, return the first array.
 */
public class BiggerTwo {

    public int[] biggerTwo(int[] a, int[] b) {
        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];

        if (suma >= sumb) return a;
        return b;
    }

    public static void main(String[] args) {
        BiggerTwo bt = new BiggerTwo();

        System.out.println(java.util.Arrays.toString(
            bt.biggerTwo(new int[]{1, 2}, new int[]{3, 1})
        )); // [3, 1]

        System.out.println(java.util.Arrays.toString(
            bt.biggerTwo(new int[]{5, 6}, new int[]{3, 8})
        )); // [5, 6] (11 vs 11 → return first)

        System.out.println(java.util.Arrays.toString(
            bt.biggerTwo(new int[]{4, 2}, new int[]{1, 9})
        )); // [1, 9]
    }
}
