package logic2;

/**
 * CodingBat - Logic-2: noTeenSum
 *
 * Return the sum of a, b, and c, but values between 13-19 (inclusive)
 * count as 0, except for 15 and 16.
 */
public class NoTeenSum {

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }
        return n;
    }

    public static void main(String[] args) {
        NoTeenSum nts = new NoTeenSum();

        System.out.println(nts.noTeenSum(1, 2, 3));     // 6
        System.out.println(nts.noTeenSum(2, 13, 1));    // 3
        System.out.println(nts.noTeenSum(2, 1, 14));    // 3
        System.out.println(nts.noTeenSum(15, 17, 19));  // 15 (17=0, 19=0)
        System.out.println(nts.noTeenSum(16, 15, 14));  // 31 (14=0)
    }
}
