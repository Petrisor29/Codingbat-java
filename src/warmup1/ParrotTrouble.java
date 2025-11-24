package warmup1;

/**
 * CodingBat - Warmup-1: parrotTrouble
 *
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 */
public class ParrotTrouble {

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) return true;
        return false;
    }

    public static void main(String[] args) {
        ParrotTrouble pt = new ParrotTrouble();

        System.out.println(pt.parrotTrouble(true, 6));   // true
        System.out.println(pt.parrotTrouble(true, 7));   // false
        System.out.println(pt.parrotTrouble(false, 6));  // false
        System.out.println(pt.parrotTrouble(true, 21));  // true
    }
}
