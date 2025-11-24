package warmup2;

/**
 * CodingBat - Warmup-2: last2
 *
 * Given a string, return the count of the number of times
 * that a substring length 2 appears in the string
 * and also as the last 2 chars of the string.
 */
public class Last2 {

    public int last2(String str) {
        if (str.length() < 2) return 0;

        int count = 0;
        String last2 = str.substring(str.length() - 2);

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Last2 l2 = new Last2();

        System.out.println(l2.last2("hixxhi"));   // 1
        System.out.println(l2.last2("xaxxaxaxx")); // 1
        System.out.println(l2.last2("axxxaaxx"));  // 2
        System.out.println(l2.last2("xxaxxaxxaxx"));// 3
        System.out.println(l2.last2("hi"));        // 0
        System.out.println(l2.last2("h"));         // 0
    }
}
