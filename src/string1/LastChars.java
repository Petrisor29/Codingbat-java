package string1;

/**
 * CodingBat - String-1: lastChars
 *
 * Return a new string made of the first char of a
 * and the last char of b. Use '@' if either string is empty.
 */
public class LastChars {

    public String lastChars(String a, String b) {
        String first = "@";
        String last = "@";

        if (a.length() > 0) {
            first = a.substring(0, 1);
        }
        if (b.length() > 0) {
            last = b.substring(b.length() - 1);
        }

        return first + last;
    }

    public static void main(String[] args) {
        LastChars l = new LastChars();

        System.out.println(l.lastChars("last", "chars")); // "ls"
        System.out.println(l.lastChars("yo", "java"));    // "ya"
        System.out.println(l.lastChars("", "hello"));     // "@o"
        System.out.println(l.lastChars("hi", ""));        // "h@"
        System.out.println(l.lastChars("", ""));          // "@@"
    }
}
