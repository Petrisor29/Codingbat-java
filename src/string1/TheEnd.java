package string1;

/**
 * CodingBat - String-1: theEnd
 *
 * Given a string and a boolean front,
 * return the first char if front is true,
 * otherwise return the last char.
 */
public class TheEnd {

    public String theEnd(String str, boolean front) {
        String back = str.substring(str.length() - 1);
        String face = str.substring(0, 1);

        if (!front) return back;
        return face;
    }

    public static void main(String[] args) {
        TheEnd t = new TheEnd();

        System.out.println(t.theEnd("Hello", true));   // "H"
        System.out.println(t.theEnd("Hello", false));  // "o"
        System.out.println(t.theEnd("oh", true));      // "o"
        System.out.println(t.theEnd("oh", false));     // "h"
    }
}
