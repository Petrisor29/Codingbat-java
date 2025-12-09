package warmup1;

/**
 * CodingBat - Warmup-1: backAround
 *
 * Given a string, take the last char and return a new string
 * with the last char added at the front and the back.
 */
public class BackAround {

    public String backAround(String str) {
        char last = str.charAt(str.length() - 1);
        return last + str + last;
    }

    public static void main(String[] args) {
        BackAround b = new BackAround();

        System.out.println(b.backAround("cat"));     // "tcatt"
        System.out.println(b.backAround("Hello"));   // "oHelloo"
        System.out.println(b.backAround("a"));       // "aaa"
    }
}
