package warmup2;

/**
 * CodingBat - Warmup-2: stringSplosion
 *
 * Given a non-empty string like "Code",
 * return a string like "CCoCodCode".
 */
public class StringSplosion {

    public String stringSplosion(String str) {
        int n = str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(0, i);
        }
        return result + str;
    }

    public static void main(String[] args) {
        StringSplosion ss = new StringSplosion();

        System.out.println(ss.stringSplosion("Code"));     // "CCoCodCode"
        System.out.println(ss.stringSplosion("abc"));      // "aababc"
        System.out.println(ss.stringSplosion("ab"));       // "aab"
        System.out.println(ss.stringSplosion("x"));        // "x"
    }
}
