package array3;

/**
 * CodingBat - Array-3: seriesUp
 *
 * Given n, create an array following the pattern:
 * n = 1 → [1]
 * n = 2 → [1, 1,2]
 * n = 3 → [1, 1,2, 1,2,3]
 * n = 4 → [1, 1,2, 1,2,3, 1,2,3,4]
 */
public class SeriesUp {

    public int[] seriesUp(int n) {
        int len = (n * (n + 1)) / 2;
        int[] series = new int[len];
        int index = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                series[index++] = j;
            }
        }

        return series;
    }

    public static void main(String[] args) {
        SeriesUp s = new SeriesUp();

        System.out.println(java.util.Arrays.toString(s.seriesUp(1))); // [1]
        System.out.println(java.util.Arrays.toString(s.seriesUp(2))); // [1, 1,2]
        System.out.println(java.util.Arrays.toString(s.seriesUp(3))); // [1, 1,2, 1,2,3]
        System.out.println(java.util.Arrays.toString(s.seriesUp(4))); // [1, 1,2, 1,2,3, 1,2,3,4]
        System.out.println(java.util.Arrays.toString(s.seriesUp(0))); // []
    }
}
