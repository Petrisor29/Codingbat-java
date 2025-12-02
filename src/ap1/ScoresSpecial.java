package ap1;

/**
 * CodingBat - AP-1: scoresSpecial
 *
 * The special score is the largest value ending in 0.
 * Return the sum of the special scores for arrays a and b.
 */
public class ScoresSpecial {

    public int scoresSpecial(int[] a, int[] b) {
        return maxSpecialScore(a) + maxSpecialScore(b);
    }

    public int maxSpecialScore(int[] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0 && arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ScoresSpecial s = new ScoresSpecial();

        System.out.println(s.scoresSpecial(
                new int[]{12, 10, 4},
                new int[]{2, 20, 30}));   // 40

        System.out.println(s.scoresSpecial(
                new int[]{20, 20, 30},
                new int[]{2, 20, 10}));   // 40

        System.out.println(s.scoresSpecial(
                new int[]{12, 11, 4},
                new int[]{2, 3, 4}));     // 0

        System.out.println(s.scoresSpecial(
                new int[]{90, 3, 10},
                new int[]{100, 55}));     // 190
    }
}
