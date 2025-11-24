package string3;

/**
 * CodingBat - String-3: equalIsNot
 *
 * Return true if the number of "is" substrings equals
 * the number of "not" substrings in the string.
 */
public class EqualIsNot {

    public boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) {
                countIs++;
            }
        }

        return countIs == countNot;
    }

    public static void main(String[] args) {
        EqualIsNot e = new EqualIsNot();

        System.out.println(e.equalIsNot("This is not"));        // false
        System.out.println(e.equalIsNot("isnotis"));            // true
        System.out.println(e.equalIsNot("isxxnotyyis"));        // true
        System.out.println(e.equalIsNot("isxxnotyy"));          // false
        System.out.println(e.equalIsNot("xxxyyyzzz"));          // true (0 == 0)
    }
}
