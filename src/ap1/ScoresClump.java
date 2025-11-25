package ap1;

/**
 * CodingBat - AP-1: scoresClump
 *
 * Return true if there is a "clump" of three consecutive scores
 * where all three values are within 2 of each other.
 */
public class ScoresClump {

    public boolean scoresClump(int[] scores) {
        if (scores.length < 3) return false;

        for (int i = 0; i < scores.length - 2; i++) {
            int diff1 = Math.abs(scores[i] - scores[i + 1]);
            int diff2 = Math.abs(scores[i + 1] - scores[i + 2]);
            int diff3 = Math.abs(scores[i] - scores[i + 2]);

            if (diff1 <= 2 && diff2 <= 2 && diff3 <= 2) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ScoresClump sc = new ScoresClump();

        System.out.println(sc.scoresClump(new int[]{3, 4, 5}));           // true
        System.out.println(sc.scoresClump(new int[]{3, 4, 10}));          // false
        System.out.println(sc.scoresClump(new int[]{3, 4, 6}));           // true
        System.out.println(sc.scoresClump(new int[]{1, 2, 3, 8, 9, 10})); // true
        System.out.println(sc.scoresClump(new int[]{1, 5, 10}));          // false
    }
}
