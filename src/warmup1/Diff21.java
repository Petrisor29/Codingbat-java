package warmup1;

/**
 * CodingBat - Warmup-1: diff21
 *
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
public class Diff21 {

    public int diff21(int n) {
        if (n > 21) return 2 * Math.abs(n - 21);
        return Math.abs(n - 21);
    }

    public static void main(String[] args) {
        Diff21 d = new Diff21();

        System.out.println(d.diff21(19)); // 2
        System.out.println(d.diff21(10)); // 11
        System.out.println(d.diff21(21)); // 0
        System.out.println(d.diff21(25)); // 8
        System.out.println(d.diff21(30)); // 18
    }
}
