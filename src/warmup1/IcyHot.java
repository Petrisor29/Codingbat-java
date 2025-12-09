package warmup1;

/**
 * CodingBat - Warmup-1: icyHot
 *
 * Return true if one temperature is below 0
 * and the other is above 100.
 */
public class IcyHot {

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        IcyHot i = new IcyHot();

        System.out.println(i.icyHot(-1, 120)); // true
        System.out.println(i.icyHot(120, -1)); // true
        System.out.println(i.icyHot(2, 120));  // false
        System.out.println(i.icyHot(-5, 80));  // false
    }
}
