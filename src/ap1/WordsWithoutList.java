package ap1;

import java.util.ArrayList;
import java.util.List;

/**
 * CodingBat - AP-1: wordsWithoutList
 *
 * Return a list containing the words from the array
 * that do NOT have length == len.
 */
public class WordsWithoutList {

    public List wordsWithoutList(String[] words, int len) {

        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) continue;
            lista.add(words[i]);
        }

        return lista;
    }

    public static void main(String[] args) {
        WordsWithoutList w = new WordsWithoutList();

        System.out.println(w.wordsWithoutList(
                new String[]{"a", "bb", "b", "ccc"}, 1)); 
        // [bb, ccc]

        System.out.println(w.wordsWithoutList(
                new String[]{"a", "bb", "b", "ccc"}, 3)); 
        // [a, bb, b]

        System.out.println(w.wordsWithoutList(
                new String[]{"hello", "hi", "test"}, 2)); 
        // [hello, test]
    }
}
