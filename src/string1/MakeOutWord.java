package string1;

/**
 * CodingBat - String-1: makeOutWord
 *
 * Given an "out" string of length 4, such as "<<>>",
 * and a word, return a new string where the word is inside the out string:
 * e.g. "<<word>>".
 */
public class MakeOutWord {

    public String makeOutWord(String out, String word) {
        int half = out.length() / 2;
        return out.substring(0, half) + word + out.substring(half, out.length());
    }

    public static void main(String[] args) {
        MakeOutWord mow = new MakeOutWord();

        System.out.println(mow.makeOutWord("<<>>", "Yay"));   // <<Yay>>
        System.out.println(mow.makeOutWord("<<>>", "WooHoo")); // <<WooHoo>>
        System.out.println(mow.makeOutWord("{{}}", "Hello"));  // {{Hello}}
        System.out.println(mow.makeOutWord("[[]]", "Java"));   // [[Java]]
    }
}
