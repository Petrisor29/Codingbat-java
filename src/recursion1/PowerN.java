package recursion1;

/**
 * CodingBat - Recursion-1: powerN
 *
 * Compute base^n recursively.
 */
public class PowerN {

    public int powerN(int base, int n) {
        if (n == 0) return 1;
        if (n == 1) return base;

        return base * powerN(base, n - 1);
    }

    public static void main(String[] args) {
        PowerN p = new PowerN();

        System.out.println(p.powerN(3, 1));  // 3
        System.out.println(p.powerN(3, 2));  // 9
        System.out.println(p.powerN(3, 3));  // 27
        System.out.println(p.powerN(2, 5));  // 32
        System.out.println(p.powerN(5, 0));  // 1
    }
}
