package string1;

/**
 * CodingBat - String-1: endsLy
 *
 * Return true if the string ends with "ly".
 */
public class EndsLy {

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        return str.substring(str.length() - 2).equals("ly");
    }

    public static void main(String[] args) {
        EndsLy e = new EndsLy();

        System.out.println(e.endsLy("oddly"));   // true
        System.out.println(e.endsLy("y"));       // false
        System.out.println(e.endsLy("oddy"));    // false
        System.out.println(e.endsLy("really"));  // true
        System.out.println(e.endsLy("quick"));   // false
    }
}
