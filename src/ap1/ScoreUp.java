package ap1;

/**
 * CodingBat - AP-1: scoreUp
 *
 * Compare the student's answers with the key:
 *   - exact match: +4
 *   - wrong answer (not "?"): -1
 *   - "?" : 0 points
 */
public class ScoreUp {

    public int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (answers[i].equals("?")) {
                continue; // no points
            }

            if (key[i].equals(answers[i])) {
                score += 4;
            } else {
                score -= 1;
            }
        }

        return score;
    }

    public static void main(String[] args) {
        ScoreUp s = new ScoreUp();

        System.out.println(s.scoreUp(
                new String[]{"a", "a", "b", "b"},
                new String[]{"a", "c", "b", "?"}));
        // Expected: 6

        System.out.println(s.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"a", "b", "c"}));
        // Expected: 12

        System.out.println(s.scoreUp(
                new String[]{"a", "b", "c"},
                new String[]{"?", "?", "?"}));
        // Expected: 0

        System.out.println(s.scoreUp(
                new String[]{"t", "t", "f"},
                new String[]{"t", "?", "x"}));
        // Expected: 3
    }
}
