package string1;

/**
 * CodingBat - String-1: middleTwo
 *
 * Given a string of even length,
 * return the middle 2 characters.
 */
public class MiddleTwo {

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public static void main(String[] args) {
        MiddleTwo m = new MiddleTwo();

        System.out.println(m.middleTwo("string")); // "ri"
        System.out.println(m.middleTwo("code"));   // "de"
        System.out.println(m.middleTwo("Practice")); // "ct"
        System.out.println(m.middleTwo("ab"));     // "ab"
    }
}
