package logic2;

/**
 * CodingBat - Logic-2: linearIn
 *
 * Check whether every element of inner[] appears in outer[].
 * Your version uses a simple nested search (correct and valid).
 */
public class LinearIn {

    public boolean linearIn(int[] outer, int[] inner) {

        for (int i = 0; i < inner.length; i++) {
            boolean found = false;

            for (int j = 0; j < outer.length; j++) {
                if (inner[i] == outer[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        LinearIn l = new LinearIn();

        System.out.println(l.linearIn(
                new int[]{1, 2, 4, 6},
                new int[]{2, 4}));              // true

        System.out.println(l.linearIn(
                new int[]{1, 2, 4, 6},
                new int[]{2, 3, 4}));           // false

        System.out.println(l.linearIn(
                new int[]{1, 2, 2, 2, 2},
                new int[]{2, 2}));              // true

        System.out.println(l.linearIn(
                new int[]{5, 6, 7},
                new int[]{7}));                 // true
    }
}
