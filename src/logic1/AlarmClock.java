package logic1;

/**
 * CodingBat - Logic-1: alarmClock
 *
 * Given a day of the week encoded as 0=Sun, 1=Mon, ... 6=Sat,
 * and a boolean indicating if we are on vacation,
 * return the alarm time as a string:
 * - "7:00" on weekdays (Mon-Fri) when not on vacation
 * - "10:00" on weekends (Sat,Sun) OR weekdays during vacation
 * - "off" on weekends during vacation
 */
public class AlarmClock {

    public String alarmClock(int day, boolean vacation) {
        if (!vacation) {
            if (day != 6 && day != 0) return "7:00";
            return "10:00";
        }
        if (vacation) {
            if (day != 0 && day != 6) return "10:00";
        }
        return "off";
    }

    public static void main(String[] args) {
        AlarmClock ac = new AlarmClock();

        System.out.println(ac.alarmClock(1, false)); // "7:00"
        System.out.println(ac.alarmClock(5, false)); // "7:00"
        System.out.println(ac.alarmClock(0, false)); // "10:00"
        System.out.println(ac.alarmClock(6, false)); // "10:00"
        System.out.println(ac.alarmClock(1, true));  // "10:00"
        System.out.println(ac.alarmClock(0, true));  // "off"
        System.out.println(ac.alarmClock(6, true));  // "off"
    }
}
