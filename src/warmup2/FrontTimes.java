package warmup2;

/**
 * CodingBat - Warmup-2: frontTimes
 *
 * Given a string and a non-negative int n, return a larger string
 * that is n copies of the front of the string. 
 * The front is the first 3 chars, or whatever is there if the string is less than length 3.
 */
public class FrontTimes {

    public String frontTimes(String str, int n) {
        String result = "";
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                result += str;
            }
        } else {
            String first = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                result += first;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FrontTimes ft = new FrontTimes();

        System.out.println(ft.frontTimes("Chocolate", 2)); // ChoCho
        System.out.println(ft.frontTimes("Chocolate", 3)); // ChoChoCho
        System.out.println(ft.frontTimes("Abc", 3));       // AbcAbcAbc
        System.out.println(ft.frontTimes("Hi", 4));        // HiHiHiHi
    }
}
