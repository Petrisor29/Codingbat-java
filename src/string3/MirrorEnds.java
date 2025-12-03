package string3;

/**
 * CodingBat - String-3: mirrorEnds
 *
 * Return the longest prefix of the string that is the
 * mirror image of a suffix of the same length from the end.
 */
public class MirrorEnds {

    public String mirrorEnds(String string) {

        int n = string.length();
        int i = 0, j = n - 1;

        while (i < n && string.charAt(i) == string.charAt(j)) {
            i++;
            j--;
        }

        return string.substring(0, i);
    }

    public static void main(String[] args) {
        MirrorEnds m = new MirrorEnds();

        System.out.println(m.mirrorEnds("abXYZba"));  // "ab"
        System.out.println(m.mirrorEnds("abca"));     // "a"
        System.out.println(m.mirrorEnds("aba"));      // "aba"
        System.out.println(m.mirrorEnds("xxx"));      // "xxx"
        System.out.println(m.mirrorEnds("abc"));      // ""
    }
}
