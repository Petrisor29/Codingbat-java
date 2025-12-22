package warmup1;

/**
 * CodingBat - Warmup-1: max1020
 *
 * Given 2 positive int values, return the larger value that is in the 
 * range 10..20 inclusive, or return 0 if neither is in that range.
 */
public class Max1020 {

    public int max1020(int a, int b) {
        int max = 0;
        for (int i = 10; i <= 20; i++) {
            if (a == i) {
                max = a;
            } else if (b == i && b > max) {
                max = b;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Max1020 obj = new Max1020();

        // Cazuri de testare
        System.out.println(obj.max1020(11, 19)); // 19
        System.out.println(obj.max1020(19, 11)); // 19
        System.out.println(obj.max1020(11, 9));  // 11
        System.out.println(obj.max1020(9, 21));  // 0
        System.out.println(obj.max1020(10, 21)); // 10
        System.out.println(obj.max1020(20, 10)); // 20
        System.out.println(obj.max1020(7, 8));   // 0
    }
}
