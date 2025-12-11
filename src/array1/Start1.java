package array1;

/**
 * CodingBat - Array-1: start1
 *
 * Given 2 int arrays, return how many of them have 1 as their first element.
 */
public class Start1 {

    public int start1(int[] a, int[] b) {
        int count = 0;

        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;

        return count;
    }

    public static void main(String[] args) {
        Start1 s = new Start1();

        System.out.println(s.start1(new int[]{1, 2, 3}, new int[]{1, 3})); // 2
        System.out.println(s.start1(new int[]{1, 2, 3}, new int[]{7, 3})); // 1
        System.out.println(s.start1(new int[]{}, new int[]{1}));           // 1
        System.out.println(s.start1(new int[]{}, new int[]{}));            // 0
        System.out.println(s.start1(new int[]{2, 3}, new int[]{7, 8}));    // 0
    }
}
