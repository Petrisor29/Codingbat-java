package logic1;

/**
 * CodingBat - Logic-1: caughtSpeeding
 *
 * You are driving a little too fast, and a police officer stops you.
 * The result is:
 * 0 = no ticket
 * 1 = small ticket
 * 2 = big ticket
 *
 * On your birthday, you get +5 mph grace.
 */
public class CaughtSpeeding {

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (!isBirthday) {
            if (speed <= 60) return 0;
            if (speed >= 61 && speed <= 80) return 1;
            if (speed > 80) return 2;
        }
        if (isBirthday) {
            if (speed <= 65) return 0;
            if (speed >= 61 && speed <= 85) return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        CaughtSpeeding cs = new CaughtSpeeding();

        System.out.println(cs.caughtSpeeding(60, false)); // 0
        System.out.println(cs.caughtSpeeding(65, false)); // 1
        System.out.println(cs.caughtSpeeding(85, false)); // 2

        System.out.println(cs.caughtSpeeding(65, true));  // 0
        System.out.println(cs.caughtSpeeding(70, true));  // 1
        System.out.println(cs.caughtSpeeding(90, true));  // 2
    }
}
