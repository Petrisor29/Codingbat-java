package array1;

/**
 * CodingBat - Array-1: makePi
 *
 * Return an int array length 3 containing the first 3 digits of pi → {3, 1, 4}.
 */
public class MakePi {

    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    public static void main(String[] args) {
        MakePi mp = new MakePi();
        int[] result = mp.makePi();

        // Print the array
        System.out.print("{ ");
        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.println("}");  // { 3 1 4 }
    }
}
