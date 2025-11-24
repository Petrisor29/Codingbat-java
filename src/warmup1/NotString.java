package warmup1;

/**
 * CodingBat - Warmup-1: notString
 *
 * Given a string, return a new string where "not " has been added
 * to the front. However, if the string already begins with "not",
 * return the string unchanged.
 */
public class NotString {

    public String notString(String str) {
        if (str.startsWith("not")) return str;
        return "not " + str;
    }

    public static void main(String[] args) {
        NotString ns = new NotString();

        System.out.println(ns.notString("candy"));  // "not candy"
        System.out.println(ns.notString("x"));      // "not x"
        System.out.println(ns.notString("not bad"));// "not bad"
        System.out.println(ns.notString("bad"));    // "not bad"
    }
}
