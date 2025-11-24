package string1;

/**
 * CodingBat - String-1: firstTwo
 *
 * Given a string, return the string made of its first two chars.
 * If the string is shorter than 2, return the whole string.
 */
public class FirstTwo {

    public String firstTwo(String str) {
        if (str.length() < 2) return str;
        return str.substring(0, 2);
    }

    public static void main(String[] args) {
        FirstTwo ft = new FirstTwo();

        System.out.println(ft.firstTwo("Hello")); // "He"
        System.out.println(ft.firstTwo("abcdef")); // "ab"
        System.out.println(ft.firstTwo("a"));      // "a"
        System.out.println(ft.firstTwo(""));       // ""
    }
}
