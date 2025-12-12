package string1;

/**
 * CodingBat - String-1: middleThree
 *
 * Given a string of odd length, return the middle 3 characters.
 */
public class MiddleThree {

    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    public static void main(String[] args) {
        MiddleThree m = new MiddleThree();

        System.out.println(m.middleThree("Candy"));   // "and"
        System.out.println(m.middleThree("and"));     // "and"
        System.out.println(m.middleThree("solving")); // "lvi"
        System.out.println(m.middleThree("abc"));     // "abc"
    }
}
