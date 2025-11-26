package ap1;

/**
 * CodingBat - AP-1: wordsWithout
 *
 * Return a new array containing the words from the original array
 * except those that match the target string.
 */
public class WordsWithout {

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        // Count how many elements are NOT equal to target
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                count++;
            }
        }

        // Create the result array
        String[] noTarget = new String[count];
        int idx = 0;

        // Fill the array with elements different from target
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                noTarget[idx++] = words[i];
            }
        }

        return noTarget;
    }

    public static void main(String[] args) {
        WordsWithout w = new WordsWithout();

        print(w.wordsWithout(new String[]{"a", "b", "c", "a"}, "a"));  // ["b", "c"]
        print(w.wordsWithout(new String[]{"hello", "world"}, "x"));     // ["hello", "world"]
        print(w.wordsWithout(new String[]{"x", "x", "x"}, "x"));        // []
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
