package logic1;

/**
 * CodingBat - Logic-1: in1To10
 *
 * Return true if n is in the range 1..10, inclusive.
 * Unless outsideMode is true, then return true if n <= 1 or n >= 10.
 */
public class In1To10 {

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            if (n <= 1 || n >= 10) return true;
            return false;
        }
        if (!outsideMode) {
            if (n >= 1 && n <= 10) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        In1To10 i = new In1To10();

        System.out.println(i.in1To10(5, false));  // true
        System.out.println(i.in1To10(11, false)); // false
        System.out.println(i.in1To10(11, true));  // true
        System.out.println(i.in1To10(1, false));  // true
        System.out.println(i.in1To10(1, true));   // true
        System.out.println(i.in1To10(0, true));   // true
        System.out.println(i.in1To10(0, false));  // false
    }
}
