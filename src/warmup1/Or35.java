package warmup1;

/**
 * CodingBat - Warmup-1: or35
 *
 * Return true if the given non-negative number is a multiple of 3 or 5.
 */
public class Or35 {

    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        Or35 o = new Or35();

        System.out.println(o.or35(3));   // true
        System.out.println(o.or35(10));  // true
        System.out.println(o.or35(8));   // false
        System.out.println(o.or35(15));  // true
        System.out.println(o.or35(7));   // false
    }
}
