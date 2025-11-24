package string1;

/**
 * CodingBat - String-1: withoutEnd
 *
 * Given a string, return a version without the first and last char.
 * The string length will be 2 or more.
 */
public class WithoutEnd {

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        WithoutEnd we = new WithoutEnd();

        System.out.println(we.withoutEnd("Hello")); // "ell"
        System.out.println(we.withoutEnd("java"));  // "av"
        System.out.println(we.withoutEnd("coding")); // "odin"
        System.out.println(we.withoutEnd("ab"));    // "" (string de lungime 2)
    }
}
