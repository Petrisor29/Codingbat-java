package logic2;

/**
 * CodingBat - Logic-2: closeFar
 *
 * Given three ints a, b, c:
 * Return true if one of b or c is "close" to a (diff <= 1)
 * while the other is "far" from both the close value and from a (diff >= 2).
 */
public class CloseFar {

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(b - c) >= 2 && Math.abs(c - a) >= 2) return true;
        if (Math.abs(a - c) <= 1 && Math.abs(b - c) >= 2 && Math.abs(b - a) >= 2) return true;

        return false;
    }

    public static void main(String[] args) {
        CloseFar cf = new CloseFar();

        System.out.println(cf.closeFar(1, 2, 10));  // true
        System.out.println(cf.closeFar(1, 2, 3));   // false
        System.out.println(cf.closeFar(4, 1, 3));   // false
        System.out.println(cf.closeFar(4, 5, 3));   // true
        System.out.println(cf.closeFar(10, 9, 8));  // false
    }
}
