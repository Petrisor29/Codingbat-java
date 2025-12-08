package recursion1;

/**
 * CodingBat - Recursion-1: countX
 *
 * Count recursively the number of 'x' chars in the string.
 */
public class CountX {

    public int countX(String str) {
        int len = str.length();
        if (len == 0) return 0;

        if (str.charAt(len - 1) == 'x') {
            return 1 + countX(str.substring(0, len - 1));
        } else {
            return countX(str.substring(0, len - 1));
        }
    }

    public static void main(String[] args) {
        CountX c = new CountX();

        System.out.println(c.countX(""));          // 0
        System.out.println(c.countX("abc"));       // 0
        System.out.println(c.countX("xxhixx"));    // 4
        System.out.println(c.countX("xhixhix"));   // 3
        System.out.println(c.countX("xxxx"));      // 4
    }
}
