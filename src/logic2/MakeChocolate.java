package logic2;

/**
 * CodingBat - Logic-2: makeChocolate
 *
 * We want to make a package of chocolate bars. Small bars are 1 unit, big bars are 5 units.
 * Return the number of small bars needed to reach the goal.
 * Return -1 if it cannot be done.
 */
public class MakeChocolate {

    public int makeChocolate(int small, int big, int goal) {
        int big_used = goal / 5;
        if (big_used > big) {
            big_used = big;
        }
        if ((goal - big_used * 5) <= small) return goal - big_used * 5;

        return -1;
    }

    public static void main(String[] args) {
        MakeChocolate mc = new MakeChocolate();

        System.out.println(mc.makeChocolate(4, 1, 9));  // 4
        System.out.println(mc.makeChocolate(4, 1, 10)); // -1
        System.out.println(mc.makeChocolate(4, 1, 7));  // 2
        System.out.println(mc.makeChocolate(6, 2, 7));  // 2
        System.out.println(mc.makeChocolate(6, 2, 12)); // 2
        System.out.println(mc.makeChocolate(0, 2, 10)); // 0
    }
}
