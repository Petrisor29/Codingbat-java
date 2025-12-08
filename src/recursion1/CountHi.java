package recursion1;

/**
 * CodingBat - Recursion-1: countHi
 *
 * Return the number of times "hi" appears in the string.
 * Recursive solution scanning progressively smaller substrings.
 */
public class CountHi {

    public int countHi(String str) {

        int len = str.length();
        if (len < 2) return 0;   // nu există loc pentru "hi"

        // verificăm ultimele 2 caractere
        if (str.charAt(len - 2) == 'h' && str.charAt(len - 1) == 'i') {
            // găsit "hi", tăiem doar ultimul caracter
            return 1 + countHi(str.substring(0, len - 1));
        }

        // altfel, tăiem ultimul caracter și continuăm
        return countHi(str.substring(0, len - 1));
    }

    public static void main(String[] args) {
        CountHi c = new CountHi();

        System.out.println(c.countHi("hi"));         // 1
        System.out.println(c.countHi("hihi"));       // 2
        System.out.println(c.countHi("xhixhix"));    // 2
        System.out.println(c.countHi("xxhixx"));     // 1
        System.out.println(c.countHi("h"));          // 0
        System.out.println(c.countHi(""));           // 0
        System.out.println(c.countHi("hihihi"));     // 3
    }
}
