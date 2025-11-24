package warmup1;

/**
 * CodingBat - Warmup-1: makes10
 *
 * Return true if either of the integers is 10,
 * or if their sum is 10.
 */
public class Makes10 {

    public boolean makes10(int a, int b) {
        if (a == 10 || b == 10 || (a + b == 10)) return true;
        return false;
    }

    public static void main(String[] args) {
        Makes10 m = new Makes10();

        System.out.println(m.makes10(9, 10)); // true
        System.out.println(m.makes10(9, 9));  // false
        System.out.println(m.makes10(1, 9));  // true
        System.out.println(m.makes10(10, 1)); // true
    }
}
