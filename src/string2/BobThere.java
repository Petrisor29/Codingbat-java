package string2;

/**
 * CodingBat - String-2: bobThere
 *
 * Return true if the given string contains a "b_b" pattern:
 * 'b' at position i and 'b' at position i+2.
 */
public class BobThere {

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BobThere bt = new BobThere();

        System.out.println(bt.bobThere("abcbob"));     // true
        System.out.println(bt.bobThere("b9b"));        // true
        System.out.println(bt.bobThere("bac"));        // false
        System.out.println(bt.bobThere("bbbbb"));      // true (multiple patterns)
        System.out.println(bt.bobThere("xyz"));        // false
    }
}
