package logic2;

/**
 * CodingBat - Logic-2: roundSum
 *
 * For a, b, c: return the sum of each rounded to the nearest 10.
 * Values ending in 5-9 go up to the next 10,
 * and values ending in 0-4 go down to the previous 10.
 */
public class RoundSum {

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        int remainder = num % 10;
        if (remainder >= 5) {
            return num + (10 - remainder);
        } else {
            return num - remainder;
        }
    }

    public static void main(String[] args) {
        RoundSum rs = new RoundSum();

        System.out.println(rs.roundSum(16, 17, 18));  // 60
        System.out.println(rs.roundSum(12, 13, 14));  // 30
        System.out.println(rs.roundSum(6, 4, 4));     // 10
        System.out.println(rs.roundSum(1, 2, 3));     // 0
        System.out.println(rs.roundSum(5, 5, 5));     // 30
    }
}
