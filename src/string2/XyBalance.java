package string2;

/**
 * CodingBat - String-2: xyBalance
 *
 * Return true if for every 'x' in the string there is a 'y' after it.
 * A string with no 'x' is automatically balanced.
 */
public class XyBalance {

    public boolean xyBalance(String str) {
        int lastIndexOfX = str.lastIndexOf('x');
        int lastIndexOfY = str.lastIndexOf('y');

        return lastIndexOfY >= lastIndexOfX;
    }

    public static void main(String[] args) {
        XyBalance xb = new XyBalance();

        System.out.println(xb.xyBalance("aaxbby"));    // true
        System.out.println(xb.xyBalance("aaxbb"));     // false
        System.out.println(xb.xyBalance("yaaxbb"));    // false
        System.out.println(xb.xyBalance("x"));         // false
        System.out.println(xb.xyBalance("y"));         // true
        System.out.println(xb.xyBalance("xy"));        // true
        System.out.println(xb.xyBalance(""));          // true
    }
}
