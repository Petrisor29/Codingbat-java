package logic1;

/**
 * CodingBat - Logic-1: sortaSum
 *
 * Given 2 ints, return their sum.
 * However, sums in the range 10..19 inclusive should return 20.
 */
public class SortaSum {

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    public static void main(String[] args) {
        SortaSum ss = new SortaSum();

        System.out.println(ss.sortaSum(3, 4));   // 7
        System.out.println(ss.sortaSum(9, 4));   // 20
        System.out.println(ss.sortaSum(10, 1));  // 20
        System.out.println(ss.sortaSum(5, 5));   // 20
        System.out.println(ss.sortaSum(20, 1));  // 21
    }
}
