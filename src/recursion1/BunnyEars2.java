package recursion1;

/**
 * CodingBat - Recursion-1: bunnyEars2
 *
 * Bunnies have 2 ears, except odd bunnies have 2 ears
 * and even bunnies have 3 ears.
 * Return the total number of ears.
 */
public class BunnyEars2 {

    public int bunnyEars2(int bunnies) {

        if (bunnies == 0) return 0;

        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);  // bunny par → 3 urechi
        } else {
            return 2 + bunnyEars2(bunnies - 1);  // bunny impar → 2 urechi
        }
    }

    public static void main(String[] args) {
        BunnyEars2 b = new BunnyEars2();

        System.out.println(b.bunnyEars2(0));  // 0
        System.out.println(b.bunnyEars2(1));  // 2
        System.out.println(b.bunnyEars2(2));  // 5
        System.out.println(b.bunnyEars2(3));  // 7
        System.out.println(b.bunnyEars2(5));  // 12
    }
}
