package warmup1;

/**
 * CodingBat - Warmup-1: missingChar
 *
 * Given a non-empty string and an index n,
 * return a new string where the char at index n has been removed.
 */
public class MissingChar {

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }

    public static void main(String[] args) {
        MissingChar mc = new MissingChar();

        System.out.println(mc.missingChar("kitten", 1)); // "ktten"
        System.out.println(mc.missingChar("kitten", 0)); // "itten"
        System.out.println(mc.missingChar("kitten", 4)); // "kittn"
        System.out.println(mc.missingChar("hello", 2));  // "helo"
    }
}
