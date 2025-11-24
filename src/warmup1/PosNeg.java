package warmup1;

/**
 * CodingBat - Warmup-1: posNeg
 *
 * Return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then both must be negative.
 */
public class PosNeg {

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        }
        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public static void main(String[] args) {
        PosNeg pn = new PosNeg();

        System.out.println(pn.posNeg(1, -1, false));  // true
        System.out.println(pn.posNeg(-1, 1, false));  // true
        System.out.println(pn.posNeg(-4, -5, true));  // true
        System.out.println(pn.posNeg(-4, -5, false)); // false
        System.out.println(pn.posNeg(1, 1, false));   // false
    }
}
