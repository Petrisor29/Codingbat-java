package warmup1;

/**
 * CodingBat - Warmup-1: lastDigit
 *
 * Given two non-negative int values, return true if they have the same 
 * last digit, such as with 27 and 57. Note that the % "mod" operator 
 * computes remainders, so 17 % 10 is 7.
 */
public class LastDigit {

    public boolean lastDigit(int a, int b) {
        int last_a = a % 10;
        int last_b = b % 10;
        
        return (last_a == last_b);
    }

    public static void main(String[] args) {
        LastDigit ld = new LastDigit();

        // Cazuri de testare
        System.out.println(ld.lastDigit(7, 17));       // true
        System.out.println(ld.lastDigit(6, 17));       // false
        System.out.println(ld.lastDigit(3, 113));      // true
        System.out.println(ld.lastDigit(114, 4));      // true
        System.out.println(ld.lastDigit(10, 0));       // true
        System.out.println(ld.lastDigit(11, 22));      // false
    }
}
