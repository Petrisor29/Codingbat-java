package recursion1;

/**
 * CodingBat - Recursion-1: bunnyEars
 *
 * Each bunny has 2 ears.
 * Return the total number of ears for the given number of bunnies.
 */
public class BunnyEars {

    public int bunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        if (bunnies == 1) return 2;

        return 2 + bunnyEars(bunnies - 1);
    }

    public static void main(String[] args) {
        BunnyEars b = new BunnyEars();

        System.out.println(b.bunnyEars(0)); // 0
        System.out.println(b.bunnyEars(1)); // 2
        System.out.println(b.bunnyEars(3)); // 6
        System.out.println(b.bunnyEars(5)); // 10
    }
}
