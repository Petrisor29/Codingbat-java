package ap1;

/**
 * CodingBat - AP-1: scores100
 *
 * Return true if there are two consecutive scores of 100.
 */
public class Scores100 {

    public boolean scores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] == 100 && scores[i - 1] == 100) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scores100 s = new Scores100();

        System.out.println(s.scores100(new int[]{1, 100, 100})); // true
        System.out.println(s.scores100(new int[]{100, 1, 100})); // false
        System.out.println(s.scores100(new int[]{100, 100, 100})); // true
        System.out.println(s.scores100(new int[]{50, 60, 70})); // false
        System.out.println(s.scores100(new int[]{100})); // false
    }
}
