package string1;

/**
 * CodingBat - String-1: hasBad
 *
 * Return true if "bad" appears starting at index 0 or 1.
 */
public class HasBad {

    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        HasBad h = new HasBad();

        System.out.println(h.hasBad("badxx"));  // true
        System.out.println(h.hasBad("xbadxx")); // true
        System.out.println(h.hasBad("xxbadxx")); // false
        System.out.println(h.hasBad("ba"));     // false
        System.out.println(h.hasBad("bad"));    // true
    }
}
