package ap1;

/**
 * CodingBat - AP-1: scoresIncreasing
 *
 * Return true if each value in the array is greater than or equal
 * to the previous value.
 */
public class ScoresIncreasing {

    public boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ScoresIncreasing si = new ScoresIncreasing();

        System.out.println(si.scoresIncreasing(new int[]{1, 2, 3}));     // true
        System.out.println(si.scoresIncreasing(new int[]{1, 3, 2}));     // false
        System.out.println(si.scoresIncreasing(new int[]{1, 1, 1, 2}));  // true
        System.out.println(si.scoresIncreasing(new int[]{5}));           // true
        System.out.println(si.scoresIncreasing(new int[]{2, 2, 2}));     // true
    }
}
