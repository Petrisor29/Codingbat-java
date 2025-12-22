package warmup1;

/**
 * CodingBat - Warmup-1: close10
 *
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 */
public class Close10 {

    public int close10(int a, int b) {
        int val_a = Math.abs(10 - a);
        int val_b = Math.abs(10 - b);
        if (val_a < val_b) return a;
        if (val_b < val_a) return b;
        return 0;
    }

    public static void main(String[] args) {
        Close10 c10 = new Close10();

        // Cazuri de testare
        System.out.println(c10.close10(8, 13));  // 8
        System.out.println(c10.close10(13, 8));  // 8
        System.out.println(c10.close10(13, 7));  // 0
        System.out.println(c10.close10(7, 13));  // 0
        System.out.println(c10.close10(5, 21));  // 5
        System.out.println(c10.close10(0, 20));  // 0
        System.out.println(c10.close10(10, 10)); // 0
    }
}
