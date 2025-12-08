package recursion1;

/**
 * CodingBat - Recursion-1: factorial
 *
 * Return the factorial of n:
 *   0! = 1
 *   1! = 1
 *   n! = n * (n - 1)!
 */
public class Factorial {

    public int factorial(int n) {
        if (n == 0) return 1;   // baza recursiei
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println(f.factorial(0));  // 1
        System.out.println(f.factorial(1));  // 1
        System.out.println(f.factorial(3));  // 6
        System.out.println(f.factorial(5));  // 120
        System.out.println(f.factorial(7));  // 5040
    }
}
