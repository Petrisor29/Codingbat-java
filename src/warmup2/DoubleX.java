package warmup2;

/**
 * CodingBat - Warmup-2: doubleX
 *
 * Return true if the first occurrence of 'x' in the string
 * is immediately followed by another 'x'.
 */
public class DoubleX {

    boolean doubleX(String str) {
        int i = str.indexOf('x');

        if (i == -1) return false;
        if (i + 1 >= str.length()) return false;

        return str.charAt(i + 1) == 'x';
    }

    public static void main(String[] args) {
        DoubleX dx = new DoubleX();

        System.out.println(dx.doubleX("axxbb"));   // true
        System.out.println(dx.doubleX("axaxax"));  // false
        System.out.println(dx.doubleX("xxxxx"));   // true
        System.out.println(dx.doubleX("abc"));     // false
        System.out.println(dx.doubleX("x"));       // false
    }
}
