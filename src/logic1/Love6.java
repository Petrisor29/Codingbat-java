package logic1;

/**
 * CodingBat - Logic-1: love6
 *
 * Return true if either integer is 6,
 * or if their sum is 6,
 * or if their absolute difference is 6.
 */
public class Love6 {

    public boolean love6(int a, int b) {
        if (a == 6 || b == 6) return true;
        if (a + b == 6 || Math.abs(a - b) == 6) return true;

        return false;
    }

    public static void main(String[] args) {
        Love6 l6 = new Love6();

        System.out.println(l6.love6(6, 4));   // true
        System.out.println(l6.love6(4, 5));   // false
        System.out.println(l6.love6(1, 5));   // true
        System.out.println(l6.love6(3, 9));   // true
        System.out.println(l6.love6(7, 1));   // false
        System.out.println(l6.love6(0, 6));   // true
    }
}
