package warmup1;

/**
 * CodingBat - Warmup-1: front3
 *
 * Given a string, return a new string which is 3 copies
 * of the front of the string. The front is the first 3 chars.
 * If the string length is less than 3, use the whole string.
 */
public class Front3 {

    public String front3(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }

        String front = str.substring(0, 3);
        return front + front + front;
    }

    public static void main(String[] args) {
        Front3 f = new Front3();

        System.out.println(f.front3("Java"));   // "JavJavJav"
        System.out.println(f.front3("Chocolate")); // "ChoChoCho"
        System.out.println(f.front3("abc"));    // "abcabcabc"
        System.out.println(f.front3("ab"));     // "ababab"
        System.out.println(f.front3("a"));      // "aaa"
    }
}
