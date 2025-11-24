package string1;

/**
 * CodingBat - String-1: firstHalf
 *
 * Given a string of even length, return the first half.
 * So the string "WooHoo" yields "Woo".
 */
public class FirstHalf {

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        FirstHalf fh = new FirstHalf();

        System.out.println(fh.firstHalf("WooHoo")); // "Woo"
        System.out.println(fh.firstHalf("Hello!")); // "Hel"
        System.out.println(fh.firstHalf("HiHi"));   // "Hi"
        System.out.println(fh.firstHalf("JavaJS")); // "Java"
    }
}
