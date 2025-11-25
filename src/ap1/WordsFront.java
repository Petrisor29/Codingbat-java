package ap1;

/**
 * CodingBat - AP-1: wordsFront
 *
 * Return a new array with the first n strings from the given array.
 */
public class WordsFront {

    public String[] wordsFront(String[] words, int n) {
        String[] N = new String[n];

        for (int i = 0; i < n; i++) {
            N[i] = words[i];
        }

        return N;
    }

    public static void main(String[] args) {
        WordsFront wf = new WordsFront();

        print(wf.wordsFront(new String[]{"a", "b", "c", "d"}, 1)); // ["a"]
        print(wf.wordsFront(new String[]{"a", "b", "c", "d"}, 2)); // ["a","b"]
        print(wf.wordsFront(new String[]{"hi", "there", "you"}, 3)); // ["hi","there","you"]
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
