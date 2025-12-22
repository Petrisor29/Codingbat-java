package warmup1;

/**
 * CodingBat - Warmup-1: in3050
 *
 * Given 2 int values, return true if they are both in the range 30..40 inclusive,
 * or they are both in the range 40..50 inclusive.
 */
public class In3050 {

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
            (a >= 40 && a <= 50 && b >= 40 && b <= 50)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        In3050 obj = new In3050();

        // Cazuri de testare
        System.out.println(obj.in3050(30, 31)); // true (ambele în 30-40)
        System.out.println(obj.in3050(30, 41)); // false (unul în 30-40, unul în 40-50)
        System.out.println(obj.in3050(40, 50)); // true (ambele în 40-50)
        System.out.println(obj.in3050(40, 51)); // false
        System.out.println(obj.in3050(39, 50)); // false (intervale mixte)
    }
}
