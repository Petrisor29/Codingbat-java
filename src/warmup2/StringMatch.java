package warmup2;

/**
 * CodingBat - Warmup-2: stringMatch
 *
 * Given 2 strings, return the count of the positions where
 * they contain the same length 2 substring.
 */
public class StringMatch {

    public int stringMatch(String a, String b) {
        int count = 0;
        int m = Math.min(a.length(), b.length());
        
        for (int i = 0; i < m - 1; i++) {
            if (a.charAt(i) == b.charAt(i) && a.charAt(i + 1) == b.charAt(i + 1)) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        StringMatch sm = new StringMatch();

        System.out.println(sm.stringMatch("xxcaazz", "xxbaaz"));   // 3
        System.out.println(sm.stringMatch("abc", "abc"));          // 2
        System.out.println(sm.stringMatch("abc", "axc"));          // 0
        System.out.println(sm.stringMatch("hello", "he"));         // 1
        System.out.println(sm.stringMatch("hi", "xxxxhi"));        // 1
    }
}
