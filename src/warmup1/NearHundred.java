package warmup1;

/**
 * CodingBat - Warmup-1: nearHundred
 *
 * Return true if n is within 10 of either 100 or 200.
 */
public class NearHundred {

    public boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) return true;
        return false;
    }

    public static void main(String[] args) {
        NearHundred nh = new NearHundred();

        System.out.println(nh.nearHundred(93));   // true
        System.out.println(nh.nearHundred(90));   // true
        System.out.println(nh.nearHundred(89));   // false
        System.out.println(nh.nearHundred(190));  // true
        System.out.println(nh.nearHundred(210));  // true
        System.out.println(nh.nearHundred(211));  // false
    }
}
