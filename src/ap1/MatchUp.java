package ap1;

/**
 * CodingBat - AP-1: matchUp
 *
 * Count how many positions i satisfy:
 *  - both a[i] and b[i] are non-empty
 *  - their first characters match
 */
public class MatchUp {

    public int matchUp(String[] a, String[] b) {
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty()) {
                if (a[i].charAt(0) == b[i].charAt(0)) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        MatchUp m = new MatchUp();

        System.out.println(m.matchUp(
                new String[]{"aa", "bb", "cc"},
                new String[]{"aaa", "b", "bb"})); // 2

        System.out.println(m.matchUp(
                new String[]{"aa", "", "cc"},
                new String[]{"", "bb", "c"}));     // 1

        System.out.println(m.matchUp(
                new String[]{"x", "y", "z"},
                new String[]{"x", "yzz", "zzz"})); // 3

        System.out.println(m.matchUp(
                new String[]{"b", "x", "y", "z"},
                new String[]{"a", "x", "yyy", "zzz"})); // 3
    }
}
