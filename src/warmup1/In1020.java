package warmup1;

/**
 * CodingBat - Warmup-1: in1020
 *
 * Return true if either of the integers is in the range 10..20 inclusive.
 */
public class In1020 {

    public boolean in1020(int a, int b) {
        if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        In1020 i = new In1020();

        System.out.println(i.in1020(12, 99)); // true
        System.out.println(i.in1020(21, 12)); // true
        System.out.println(i.in1020(8, 99));  // false
        System.out.println(i.in1020(10, 20)); // true
    }
}
