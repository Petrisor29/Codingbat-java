package ap1;

/**
 * CodingBat - AP-1: sumHeights
 *
 * Return the sum of the absolute differences between
 * consecutive heights from index start to index end.
 */
public class SumHeights {

    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            sum += Math.abs(heights[i] - heights[i + 1]);
        }

        return sum;
    }

    public static void main(String[] args) {
        SumHeights s = new SumHeights();

        System.out.println(s.sumHeights(
                new int[]{5, 3, 6, 7, 2}, 2, 4));  // 6

        System.out.println(s.sumHeights(
                new int[]{5, 3, 6, 7, 2}, 0, 1));  // 2

        System.out.println(s.sumHeights(
                new int[]{5, 3, 6, 7, 2}, 0, 4));  // 11
    }
}
