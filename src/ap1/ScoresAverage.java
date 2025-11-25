package ap1;

/**
 * CodingBat - AP-1: scoresAverage
 *
 * Compute the average of the first half and the second half
 * of the array, and return the larger average.
 */
public class ScoresAverage {

    public int scoresAverage(int[] scores) {
        int firstHalf = average(scores, 0, scores.length / 2);
        int secondHalf = average(scores, scores.length / 2, scores.length);

        if (firstHalf > secondHalf) return firstHalf;
        else return secondHalf;
    }

    int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += scores[i];
        }

        return sum / (end - start);
    }

    public static void main(String[] args) {
        ScoresAverage sa = new ScoresAverage();

        System.out.println(sa.scoresAverage(new int[]{2, 2, 4, 4}));      // 4
        System.out.println(sa.scoresAverage(new int[]{1, 2, 3, 4, 5, 6})); // 5
        System.out.println(sa.scoresAverage(new int[]{100, 50, 50, 100})); // 100
        System.out.println(sa.scoresAverage(new int[]{10, 20}));          // 20
        System.out.println(sa.scoresAverage(new int[]{3, 3, 3, 3}));      // 3
    }
}
