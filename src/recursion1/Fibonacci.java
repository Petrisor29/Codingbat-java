package recursion1;

/**
 * CodingBat - Recursion-1: fibonacci
 *
 * Compute the nth Fibonacci number using simple recursion.
 *   fib(0) = 0
 *   fib(1) = 1
 *   fib(n) = fib(n-1) + fib(n-2)
 */
public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();

        System.out.println(f.fibonacci(0));  // 0
        System.out.println(f.fibonacci(1));  // 1
        System.out.println(f.fibonacci(2));  // 1
        System.out.println(f.fibonacci(3));  // 2
        System.out.println(f.fibonacci(5));  // 5
        System.out.println(f.fibonacci(7));  // 13
    }
}
