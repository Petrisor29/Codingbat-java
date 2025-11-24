package string1;

/**
 * CodingBat - String-1: comboString
 *
 * Given 2 strings, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer on the inside.
 */
public class ComboString {

    public String comboString(String a, String b) {
        if (a.length() < b.length()) {
            return a + b + a;
        }
        return b + a + b;
    }

    public static void main(String[] args) {
        ComboString cs = new ComboString();

        System.out.println(cs.comboString("Hello", "hi")); // "hiHellohi"
        System.out.println(cs.comboString("hi", "Hello")); // "hiHellohi"
        System.out.println(cs.comboString("aaa", "b"));    // "baaab"
        System.out.println(cs.comboString("x", "yz"));     // "xyzx"
    }
}
