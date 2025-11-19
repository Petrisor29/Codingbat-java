package string2;

/**
 * CodingBat - String-2: countHi
 *
 * Return the number of times that the string "hi" appears in the given string.
 */
public class CountHi {

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountHi ch = new CountHi();

        System.out.println(ch.countHi("abc hi ho"));     // 1
        System.out.println(ch.countHi("ABChi hi"));       // 2
        System.out.println(ch.countHi("hihi"));           // 2
        System.out.println(ch.countHi("hello"));          // 0
        System.out.println(ch.countHi("h"));              // 0
    }
}
