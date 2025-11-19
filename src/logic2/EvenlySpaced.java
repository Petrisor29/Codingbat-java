package logic2;

/**
 * CodingBat - Logic-2: evenlySpaced
 *
 * Given three ints, a b c, return true if they are evenly spaced.
 * The difference between the smaller and middle is the same as
 * between the middle and larger.
 */
public class EvenlySpaced {

    public boolean evenlySpaced(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int medium = (a + b + c) - min - max;

        return max - medium == medium - min;
    }

    public static void main(String[] args) {
        EvenlySpaced es = new EvenlySpaced();

        System.out.println(es.evenlySpaced(2, 4, 6));   // true
        System.out.println(es.evenlySpaced(4, 6, 2));   // true
        System.out.println(es.evenlySpaced(4, 6, 3));   // false
        System.out.println(es.evenlySpaced(4, 4, 4));   // true
        System.out.println(es.evenlySpaced(1, 2, 4));   // false
    }
}
