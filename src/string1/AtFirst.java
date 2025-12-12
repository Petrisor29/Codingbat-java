package string1;

/**
 * CodingBat - String-1: atFirst
 *
 * Return the first 2 characters of the string.
 * If the string is shorter than 2, use '@' as needed.
 */
public class AtFirst {

    public String atFirst(String str) {
        if (str.length() == 0) return "@@";
        if (str.length() < 2) return str + "@";
        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        AtFirst a = new AtFirst();

        System.out.println(a.atFirst("hello")); // "he"
        System.out.println(a.atFirst("h"));     // "h@"
        System.out.println(a.atFirst(""));      // "@@"
        System.out.println(a.atFirst("ab"));    // "ab"
    }
}
