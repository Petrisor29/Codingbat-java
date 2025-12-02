package ap1;

/**
 * CodingBat - AP-1: bigHeights
 *
 * Count how many "big" steps occur between indices
 * start and end. A big step has a height difference
 * of 5 or more.
 */
public class BigHeights {

    public int bigHeights(int[] heights, int start, int end) {
        int count = 0;

        for (int i = start; i < end; i++) {
            if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        BigHeights b = new BigHeights();

        System.out.println(b.bigHeights(
                new int[]{5, 3, 6, 7, 2}, 2, 4));  // 1

        System.out.println(b.bigHeights(
                new int[]{5, 3, 6, 7, 2}, 0, 4));  // 2

        System.out.println(b.bigHeights(
                new int[]{1, 6, 1}, 0, 2));        // 2

        System.out.println(b.bigHeights(
                new int[]{1, 2, 3, 4}, 0, 3));     // 0
    }
}
