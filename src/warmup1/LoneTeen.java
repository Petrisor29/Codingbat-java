package warmup1;

/**
 * CodingBat - Warmup-1: loneTeen
 *
 * Return true if exactly one of the two numbers is in the teen range 13..19.
 * Use logical XOR (^) to check exclusivitatea.
 */
public class LoneTeen {

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19)) return true;
        return false;
    }

    public static void main(String[] args) {
        LoneTeen l = new LoneTeen();

        System.out.println(l.loneTeen(13, 99)); // true
        System.out.println(l.loneTeen(21, 19)); // true
        System.out.println(l.loneTeen(13, 13)); // false
        System.out.println(l.loneTeen(12, 20)); // false
    }
}
