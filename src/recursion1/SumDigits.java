package recursion1;

/**
 * CodingBat - Recursion-1: sumDigits
 *
 * Given a non-negative int n, return the sum of its digits recursively.
 */
public class SumDigits {

    public int sumDigits(int n) {
        if (n == 0) return 0;

        int digit = n % 10;
        return digit + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        SumDigits s = new SumDigits();

        System.out.println(s.sumDigits(0));    // 0
        System.out.println(s.sumDigits(5));    // 5
        System.out.println(s.sumDigits(126));  // 9
        System.out.println(s.sumDigits(49));   // 13
        System.out.println(s.sumDigits(999));  // 27
    }
}
