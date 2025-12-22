package warmup1;

/**
 * CodingBat - Warmup-1: intMax
 *
 * Given three int values, a b c, return the largest.
 */
public class IntMax {

    public int intMax(int a, int b, int c) {
        return(Math.max(Math.max(a,b), c));
    }

    public static void main(String[] args) {
        IntMax im = new IntMax();

        // Cazuri de testare
        System.out.println(im.intMax(1, 2, 3)); // 3
        System.out.println(im.intMax(1, 3, 2)); // 3
        System.out.println(im.intMax(3, 2, 1)); // 3
        System.out.println(im.intMax(9, 3, 3)); // 9
        System.out.println(im.intMax(0, -1, -5)); // 0
    }
}
