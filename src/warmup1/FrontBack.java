package warmup1;

/**
 * CodingBat - Warmup-1: frontBack
 *
 * Given a string, return a new string where the first and last chars
 * have been exchanged.
 */
public class FrontBack {

    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        String middle = str.substring(1, str.length() - 1);

        return last + middle + first;
    }

    public static void main(String[] args) {
        FrontBack fb = new FrontBack();

        System.out.println(fb.frontBack("code"));   // "eodc"
        System.out.println(fb.frontBack("a"));      // "a"
        System.out.println(fb.frontBack("ab"));     // "ba"
        System.out.println(fb.frontBack("abc"));    // "cba"
    }
}
