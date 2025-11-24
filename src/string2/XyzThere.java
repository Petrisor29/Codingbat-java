package string2;

/**
 * CodingBat - String-2: xyzThere
 *
 * Return true if the string contains "xyz" not preceded by a '.'.
 */
public class XyzThere {

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0) return true;
                if (str.charAt(i - 1) != '.') return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        XyzThere xt = new XyzThere();

        System.out.println(xt.xyzThere("abcxyz"));       // true
        System.out.println(xt.xyzThere("abc.xyz"));      // false
        System.out.println(xt.xyzThere("xyz.abc"));      // true
        System.out.println(xt.xyzThere("123xyz"));       // true
        System.out.println(xt.xyzThere("1.xyzxyz"));     // true
        System.out.println(xt.xyzThere("1.xyz"));        // false
    }
}
