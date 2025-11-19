package logic2;

/**
 * CodingBat - Logic-2: loneSum
 *
 * Given 3 int values, return their sum.
 * But if any of the values are the same, those values do not count.
 */
public class LoneSum {

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;

        return a + b + c;
    }

    public static void main(String[] args) {
        LoneSum ls = new LoneSum();

        System.out.println(ls.loneSum(1, 2, 3));   // 6
        System.out.println(ls.loneSum(3, 2, 3));   // 2
        System.out.println(ls.loneSum(3, 3, 3));   // 0
        System.out.println(ls.loneSum(2, 2, 1));   // 1
        System.out.println(ls.loneSum(2, 1, 1));   // 2
    }
}
