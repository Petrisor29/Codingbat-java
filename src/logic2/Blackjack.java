package logic2;

/**
 * CodingBat - Logic-2: blackjack
 *
 * Given two int values, return whichever value is closest to 21 without going over.
 * Return 0 if they both go over.
 */
public class Blackjack {

    public int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        } else if (Math.max(a, b) <= 21) {
            return Math.max(a, b);
        } else {
            return Math.min(a, b);
        }
    }

    public static void main(String[] args) {
        Blackjack bj = new Blackjack();

        System.out.println(bj.blackjack(19, 21)); // 21
        System.out.println(bj.blackjack(21, 19)); // 21
        System.out.println(bj.blackjack(19, 22)); // 19
        System.out.println(bj.blackjack(22, 22)); // 0
        System.out.println(bj.blackjack(18, 17)); // 18
    }
}
