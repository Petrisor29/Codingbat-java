package warmup1;

/**
 * CodingBat - Warmup-1: sleepIn
 *
 * We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 */
public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public static void main(String[] args) {
        SleepIn si = new SleepIn();
        System.out.println(si.sleepIn(false, false)); // true
        System.out.println(si.sleepIn(true, false));  // false
        System.out.println(si.sleepIn(false, true));  // true
    }
}
