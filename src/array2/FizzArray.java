package array2;

/**
 * CodingBat - Array-2: fizzArray
 *
 * Return an array of length n containing the values
 * 0, 1, 2, ... n-1.
 */
public class FizzArray {

    public int[] fizzArray(int n) {
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        return arr;
    }

    public static void main(String[] args) {
        FizzArray f = new FizzArray();

        print(f.fizzArray(4));  // [0, 1, 2, 3]
        print(f.fizzArray(1));  // [0]
        print(f.fizzArray(0));  // []
        print(f.fizzArray(6));  // [0, 1, 2, 3, 4, 5]
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
