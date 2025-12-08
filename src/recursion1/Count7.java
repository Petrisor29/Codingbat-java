package recursion1;

/**
 * CodingBat - Recursion-1: count7
 *
 * Count how many times the digit 7 appears in the integer n.
 */
public class Count7 {

    public int count7(int n) {
        if (n == 0) return 0;

        int digit = n % 10;

        if (digit == 7) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    public static void main(String[] args) {
        Count7 c = new Count7();

        System.out.println(c.count7(0));       // 0
        System.out.println(c.count7(7));       // 1
        System.out.println(c.count7(717));     // 2
        System.out.println(c.count7(7717));    // 3
        System.out.println(c.count7(123));     // 0
        System.out.println(c.count7(777777));  // 6
    }
}
