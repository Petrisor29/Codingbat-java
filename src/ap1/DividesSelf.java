package ap1;

/**
 * CodingBat - AP-1: dividesSelf
 *
 * Return true if each digit in n divides evenly into n.
 * A digit 0 always returns false.
 */
public class DividesSelf {

    public boolean dividesSelf(int n) {
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;

            if (digit == 0) return false;
            if (n % digit != 0) return false;

            temp = temp / 10;
        }

        return true;
    }

    public static void main(String[] args) {
        DividesSelf d = new DividesSelf();

        System.out.println(d.dividesSelf(128));   // true (128 % 1,2,8 == 0)
        System.out.println(d.dividesSelf(12));    // true
        System.out.println(d.dividesSelf(120));   // false (digit 0)
        System.out.println(d.dividesSelf(26));    // false (26 % 6 != 0)
        System.out.println(d.dividesSelf(1));     // true
    }
}
