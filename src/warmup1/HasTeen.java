package warmup1;

/**
 * CodingBat - Warmup-1: hasTeen
 *
 * Return true if any of the three integers is in the range 13..19 inclusive.
 */
public class HasTeen {

    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) ||
            (b >= 13 && b <= 19) ||
            (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HasTeen h = new HasTeen();

        System.out.println(h.hasTeen(13, 20, 10)); // true
        System.out.println(h.hasTeen(20, 19, 10)); // true
        System.out.println(h.hasTeen(20, 10, 13)); // true
        System.out.println(h.hasTeen(22, 23, 24)); // false
    }
}
