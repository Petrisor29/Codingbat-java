package array1;

/**
 * CodingBat - Array-1: middleWay
 *
 * Given 2 int arrays, a and b, each length 3,
 * return a new array of length 2 containing their middle elements.
 */
public class MiddleWay {

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public static void main(String[] args) {
        MiddleWay m = new MiddleWay();

        int[] r1 = m.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        int[] r2 = m.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0});
        int[] r3 = m.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5});

        print(r1); // [2, 5]
        print(r2); // [7, 8]
        print(r3); // [2, 4]
    }

    private static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
