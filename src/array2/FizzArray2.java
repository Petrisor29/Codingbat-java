package array2;

/**
 * CodingBat - Array-2: fizzArray2
 *
 * Return an array of length n containing the strings
 * "0", "1", "2", ... "n-1".
 */
public class FizzArray2 {

    public String[] fizzArray2(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = String.valueOf(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        FizzArray2 f = new FizzArray2();

        print(f.fizzArray2(4));  // ["0", "1", "2", "3"]
        print(f.fizzArray2(1));  // ["0"]
        print(f.fizzArray2(0));  // []
        print(f.fizzArray2(6));  // ["0", "1", "2", "3", "4", "5"]
    }

    private static void print(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
