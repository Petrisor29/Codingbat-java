package string1;

/**
 * CodingBat - String-1: nonStart
 *
 * Given 2 strings, return their concatenation,
 * except omit the first char of each.
 */
public class NonStart {

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public static void main(String[] args) {
        NonStart n = new NonStart();

        System.out.println(n.nonStart("Hello", "There")); // "ellohere"
        System.out.println(n.nonStart("java", "code"));  // "avaode"
        System.out.println(n.nonStart("shotl", "java")); // "hotlava"
    }
}
