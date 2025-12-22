package warmup1;

/**
 * CodingBat - Warmup-1: stringE
 *
 * Return true if the given string contains between 1 and 3 'e' chars.
 */
public class StringE {

    public boolean stringE(String str) {
        char[] chars = str.toCharArray();
        int count = 0;
        
        for (int i = 0; i < str.length(); i++) {
            if (chars[i] == 'e') {
                count++;
            }
        }
        
        return (count >= 1 && count <= 3);
    }

    public static void main(String[] args) {
        StringE se = new StringE();

        // Cazuri de testare
        System.out.println(se.stringE("Hello"));    // true (un 'e')
        System.out.println(se.stringE("Heelle"));   // true (trei 'e')
        System.out.println(se.stringE("Heelele")); // false (patru 'e')
        System.out.println(se.stringE("Hll"));     // false (zero 'e')
        System.out.println(se.stringE("e"));       // true
        System.out.println(se.stringE(""));        // false
    }
}
