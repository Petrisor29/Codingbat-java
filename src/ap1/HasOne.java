package ap1;

/**
 * CodingBat - AP-1: hasOne
 *
 * Return true if the integer n contains the digit 1.
 */
public class HasOne {

    public boolean hasOne(int n) {

        while (n > 0) {
            int digit = n % 10;
            if (digit == 1) return true;
            n = n / 10;
        }

        return false;
    }

    public static void main(String[] args) {
        HasOne h = new HasOne();

        System.out.println(h.hasOne(10));     // true
        System.out.println(h.hasOne(22));     // false
        System.out.println(h.hasOne(212));    // true
        System.out.println(h.hasOne(0));      // false
        System.out.println(h.hasOne(1001));   // true
    }
}
