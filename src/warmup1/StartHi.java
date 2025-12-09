package warmup1;

/**
 * CodingBat - Warmup-1: startHi
 *
 * Return true if the string starts with "hi".
 */
public class StartHi {

    public boolean startHi(String str) {
        if (str.length() < 2) return false;

        String first = str.substring(0, 2);
        return first.equals("hi");
    }

    public static void main(String[] args) {
        StartHi s = new StartHi();

        System.out.println(s.startHi("hi there")); // true
        System.out.println(s.startHi("hi"));       // true
        System.out.println(s.startHi("hello"));    // false
        System.out.println(s.startHi("h"));        // false
        System.out.println(s.startHi(""));         // false
    }
}
