package warmup1;

/**
 * CodingBat - Warmup-1: delDel
 *
 * If "del" appears starting at index 1, return the string without that "del".
 * Otherwise return the original string.
 */
public class DelDel {

    public String delDel(String str) {
        if (str.length() < 4) return str;

        String del = str.substring(1, 4);
        if (del.equals("del")) {
            return str.charAt(0) + str.substring(4);
        }

        return str;
    }

    public static void main(String[] args) {
        DelDel d = new DelDel();

        System.out.println(d.delDel("adelbc"));   // "abc"
        System.out.println(d.delDel("adelHello")); // "aHello"
        System.out.println(d.delDel("abcdel"));    // "abcdel"
        System.out.println(d.delDel("adel"));      // "a"
        System.out.println(d.delDel("xyz"));       // "xyz"
    }
}
