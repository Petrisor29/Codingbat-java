package string1;

/**
 * CodingBat - String-1: nTwice
 *
 * Given a string and an int n, return a string made of the first n
 * and the last n characters from the string.
 */
public class NTwice {

    public String nTwice(String str, int n) {
        int len = str.length();
        return str.substring(0, n) + str.substring(len - n);
    }

    public static void main(String[] args) {
        NTwice n = new NTwice();

        System.out.println(n.nTwice("Hello", 2));     // "Helo"
        System.out.println(n.nTwice("Chocolate", 3)); // "Choate"
        System.out.println(n.nTwice("Code", 1));      // "Ce"
        System.out.println(n.nTwice("Code", 2));      // "Code"
    }
}
