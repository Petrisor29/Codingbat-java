package warmup1;

/**
 * CodingBat - Warmup-1: sumDouble
 *
 * Given two int values, return their sum.
 * Unless the two values are the same, then return double their sum.
 */
public class SumDouble {

    public int sumDouble(int a, int b) {
        if (a == b) return 2 * (a + b);
        return a + b;
    }

    public static void main(String[] args) {
        SumDouble sd = new SumDouble();

        System.out.println(sd.sumDouble(1, 2));  // 3
        System.out.println(sd.sumDouble(3, 2));  // 5
        System.out.println(sd.sumDouble(2, 2));  // 8
        System.out.println(sd.sumDouble(5, 5));  // 20
    }
}
