package warmup2;

/**
 * CodingBat - Warmup-2: countXX
 *
 * Count the number of "xx" in the given string.
 * Overlapping is allowed: "xxx" has 2 occurrences.
 */
public class CountXX {

    int countXX(String str) {
        int left = 0;
        int right = 1;
        int count = 0;

        while (right < str.length()) {
            if (str.charAt(left) == 'x' && str.charAt(right) == 'x') {
                count++;
            }
            left++;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        CountXX cx = new CountXX();

        System.out.println(cx.countXX("abcxx"));   // 1
        System.out.println(cx.countXX("xxx"));     // 2
        System.out.println(cx.countXX("xxxx"));    // 3
        System.out.println(cx.countXX("axxbxx"));  // 1
        System.out.println(cx.countXX("hello"));   // 0
    }
}
