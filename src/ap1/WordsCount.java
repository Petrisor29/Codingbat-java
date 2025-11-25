package ap1;

/**
 * CodingBat - AP-1: wordsCount
 *
 * Return the number of strings with the given length.
 */
public class WordsCount {

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String w : words) {
            if (w.length() == len) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        WordsCount wc = new WordsCount();

        System.out.println(wc.wordsCount(
                new String[]{"a", "bb", "b", "ccc"}, 1)); // 2

        System.out.println(wc.wordsCount(
                new String[]{"a", "bb", "b", "ccc"}, 3)); // 1

        System.out.println(wc.wordsCount(
                new String[]{"xx", "yyy", "z", "abc", ""}, 2)); // 1

        System.out.println(wc.wordsCount(
                new String[]{"hello", "world", "java"}, 5)); // 3
    }
}
