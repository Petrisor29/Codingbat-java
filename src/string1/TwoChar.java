package string1;

/**
 * CodingBat - String-1: twoChar
 *
 * Given a string and an index, return the 2 characters starting at the index.
 * If the index is invalid, return the first 2 characters.
 */
public class TwoChar {

    public String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }

    public static void main(String[] args) {
        TwoChar t = new TwoChar();

        System.out.println(t.twoChar("java", 0));  // "ja"
        System.out.println(t.twoChar("java", 2));  // "va"
        System.out.println(t.twoChar("java", 3));  // "ja"
        System.out.println(t.twoChar("java", -1)); // "ja"
    }
}
