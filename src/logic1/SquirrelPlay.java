package logic1;

/**
 * CodingBat - Logic-1: squirrelPlay
 *
 * The squirrels in Palo Alto spend most of the day playing.
 * In the summer, the upper limit for play temperature is 100.
 * Otherwise it is 90. Return true if the squirrels play.
 */
public class SquirrelPlay {

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        }
        return (temp >= 60 && temp <= 90);
    }

    public static void main(String[] args) {
        SquirrelPlay sp = new SquirrelPlay();

        System.out.println(sp.squirrelPlay(70, false));  // true
        System.out.println(sp.squirrelPlay(95, false));  // false
        System.out.println(sp.squirrelPlay(95, true));   // true
        System.out.println(sp.squirrelPlay(55, true));   // false
        System.out.println(sp.squirrelPlay(60, false));  // true
    }
}
