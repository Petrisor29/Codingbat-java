package string1;

/**
 * CodingBat - String-1: right2
 *
 * Given a string, return a new string where the last 2 chars
 * are moved to the front.
 */
public class Right2 {

    public String right2(String str) {
        int len = str.length();
        return str.substring(len - 2) + str.substring(0, len - 2);
    }

    public static void main(String[] args) {
        Right2 r = new Right2();

        System.out.println(r.right2("Hello")); // "loHel"
        System.out.println(r.right2("java"));  // "vaja"
        System.out.println(r.right2("Hi"));    // "Hi"
    }
}
