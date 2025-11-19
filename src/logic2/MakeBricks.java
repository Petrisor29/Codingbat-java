package logic2;

/**
 * CodingBat - Logic-2: makeBricks
 *
 * We want to make a row of bricks that is "goal" inches long.
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
 * Return true if it is possible to reach the goal.
 */
public class MakeBricks {

    public boolean makeBricks(int small, int big, int goal) {
        int usableBricks = goal / 5;
        if (usableBricks > big) {
            usableBricks = big;
        }
        int remaining = goal - usableBricks * 5;
        if (remaining <= small) return true;

        return false;
    }

    public static void main(String[] args) {
        MakeBricks mb = new MakeBricks();

        System.out.println(mb.makeBricks(3, 1, 8));   // true
        System.out.println(mb.makeBricks(3, 1, 9));   // false
        System.out.println(mb.makeBricks(3, 2, 10));  // true
        System.out.println(mb.makeBricks(0, 3, 15));  // true
        System.out.println(mb.makeBricks(4, 1, 9));   // false
    }
}
