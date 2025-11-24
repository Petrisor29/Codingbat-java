package warmup2;

/**
 * CodingBat - Warmup-2: stringBits
 *
 * Given a string, return a new string made of every other char,
 * starting with the first.
 */
public class StringBits {

    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 2) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        StringBits sb = new StringBits();

        System.out.println(sb.stringBits("Hello"));     // "Hlo"
        System.out.println(sb.stringBits("Hi"));        // "H"
        System.out.println(sb.stringBits("Heeololeo")); // "Hello"
        System.out.println(sb.stringBits("abcdef"));    // "ace"
    }
}
