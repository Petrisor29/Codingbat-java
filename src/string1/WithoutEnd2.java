package string1;

/**
 * CodingBat - String-1: withouEnd2
 *
 * Given a string, return a version without the first and last char.
 * If the string length is less than 2, return the empty string.
 */
public class WithouEnd2 {

    public String withouEnd2(String str) {
        if (str.length() < 2) return "";
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        WithouEnd2 w = new WithouEnd2();

        System.out.println(w.withouEnd2("Hello")); // "ell"
        System.out.println(w.withouEnd2("abc"));   // "b"
        System.out.println(w.withouEnd2("ab"));    // ""
        System.out.println(w.withouEnd2("a"));     // ""
        System.out.println(w.withouEnd2(""));      // ""
    }
}
