package logic2;

/**
 * CodingBat - Logic-2: luckySum
 *
 * Given 3 ints, a b c, return their sum.
 * If any value is 13, that value and the values to its right do not count.
 */
public class LuckySum {

    public int luckySum(int a, int b, int c) {
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c == 13) return a + b;
        return a + b + c;
    }

    public static void main(String[] args) {
        LuckySum ls = new LuckySum();

        System.out.println(ls.luckySum(1, 2, 3));    // 6
        System.out.println(ls.luckySum(1, 2, 13));   // 3
        System.out.println(ls.luckySum(1, 13, 3));   // 1
        System.out.println(ls.luckySum(13, 2, 3));   // 0
        System.out.println(ls.luckySum(5, 5, 5));    // 15
    }
}
