package array1;

/**
 * CodingBat - Array-1: commonEnd
 *
 * Given 2 arrays of ints, return true if they have the same first element
 * or the same last element. Both arrays will be length 1 or more.
 */
public class CommonEnd {

    public boolean commonEnd(int[] a, int[] b) {
        int lena = a.length;
        int lenb = b.length;

        if (lena >= 1 && lenb >= 1 && (a[0] == b[0] || a[lena - 1] == b[lenb - 1])) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        CommonEnd ce = new CommonEnd();

        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));    // true
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2})); // false
        System.out.println(ce.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));    // true
        System.out.println(ce.commonEnd(new int[]{5}, new int[]{5}));             // true
    }
}
