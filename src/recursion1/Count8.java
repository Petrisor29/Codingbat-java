package recursion1;

/**
 * CodingBat - Recursion-1: count8
 *
 * Count how many times the digit 8 appears in n.
 * If two 8s appear next to each other, the second counts double.
 */
public class Count8 {

    public int count8(int n) {

        if (n == 0) return 0;

        int digit1 = n % 10;
        int digit2 = (n / 10) % 10;

        if (digit1 == 8 && digit2 != 8) {
            return 1 + count8(n / 10);
        }
        if (digit1 == 8 && digit2 == 8) {
            return 2 + count8(n / 10);
        }

        return count8(n / 10);
    }

    public static void main(String[] args) {
        Count8 c = new Count8();

        System.out.println(c.count8(8));        // 1
        System.out.println(c.count8(818));      // 2
        System.out.println(c.count8(8818));     // 4
        System.out.println(c.count8(888));      // 5
        System.out.println(c.count8(123));      // 0
        System.out.println(c.count8(0));        // 0
    }
}
