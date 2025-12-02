package ap1;

/**
 * CodingBat - AP-1: sumHeights2
 *
 * Similar to sumHeights, but upward steps count double.
 * Downward steps count normally.
 */
public class SumHeights2 {

    public int sumHeights2(int[] heights, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; i++) {
            int diff = heights[i + 1] - heights[i];

            if (diff > 0) {
                sum += 2 * diff;
            } else {
                sum += -diff; // same as Math.abs(diff)
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumHeights2 s = new SumHeights2();

        System.out.println(s.sumHeights2(
                new int[]{5, 3, 6, 7, 2}, 2, 4));  // 7

        System.out.println(s.sumHeights2(
                new int[]{5, 3, 6, 7, 2}, 0, 1));  // 2

        System.out.println(s.sumHeights2(
                new int[]{5, 3, 6, 7, 2}, 0, 4));  // 15
    }
}
