package string2;

/**
 * CodingBat - String-2: endOther
 *
 * Return true if either string appears at the very end of the other string,
 * case-insensitive.
 */
public class EndOther {

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length() && a.equals(b)) return true;
        if (a.length() > b.length() && a.endsWith(b)) return true;
        if (b.length() > a.length() && b.endsWith(a)) return true;

        return false;
    }

    public static void main(String[] args) {
        EndOther eo = new EndOther();

        System.out.println(eo.endOther("Hiabc", "abc"));     // true
        System.out.println(eo.endOther("AbC", "Hiabc"));     // true
        System.out.println(eo.endOther("abcXYZ", "XYZ"));    // true
        System.out.println(eo.endOther("Hello", "he"));      // false
        System.out.println(eo.endOther("Z", "z"));           // true
    }
}
