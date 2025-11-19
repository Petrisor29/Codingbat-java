package warmup1;

/**
 * CodingBat - Warmup-1: monkeyTrouble
 *
 * Return true if we are in trouble.
 * We are in trouble if both monkeys are smiling,
 * or if neither of them is smiling.
 */
public class MonkeyTrouble {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)) return true;
        return false;
    }

    public static void main(String[] args) {
        MonkeyTrouble mt = new MonkeyTrouble();

        System.out.println(mt.monkeyTrouble(true, true));   // true
        System.out.println(mt.monkeyTrouble(false, false)); // true
        System.out.println(mt.monkeyTrouble(true, false));  // false
        System.out.println(mt.monkeyTrouble(false, true));  // false
    }
}
