package string1;

/**
 * CodingBat - String-1: left2
 *
 * Given a string, return a new string where the first 2 chars
 * are moved to the end.
 */
public class Left2 {

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public static void main(String[] args) {
        Left2 l = new Left2();

        System.out.println(l.left2("Hello")); // "lloHe"
        System.out.println(l.left2("java"));  // "vaja"
        System.out.println(l.left2("Hi"));    // "Hi"
    }
}
