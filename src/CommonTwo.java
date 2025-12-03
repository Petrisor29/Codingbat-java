package ap1;

/**
 * CodingBat - AP-1: commonTwo
 *
 * Return the count of strings that appear in both arrays
 * (arrays are sorted; count duplicates only once).
 */
public class CommonTwo {

    public int commonTwo(String[] a, String[] b) {
        int i = 0, j = 0;
        int count = 0;
        String last = "";

        while (i < a.length && j < b.length) {

            if (a[i].equals(b[j]) && !a[i].equals(last)) {
                count++;
                last = a[i];
                i++;
                j++;
            }
            else if (a[i].compareTo(b[j]) < 0) {
                i++;
            }
            else if (a[i].compareTo(b[j]) > 0) {
                j++;
            }
            else {
                // same values but already counted (duplicate)
                last = a[i];
                i++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CommonTwo c = new CommonTwo();

        System.out.println(c.commonTwo(
                new String[]{"a", "a", "b", "c"},
                new String[]{"a", "b", "b", "c", "c"}));  // 3

        System.out.println(c.commonTwo(
                new String[]{"a", "a", "b", "b", "c"},
                new String[]{"a", "b", "b", "b", "c"}));  // 3

        System.out.println(c.commonTwo(
                new String[]{"a", "a", "a"},
                new String[]{"b", "b"}));                 // 0

        System.out.println(c.commonTwo(
                new String[]{"a", "b", "c"},
                new String[]{"a", "a", "a", "c"}));       // 2
    }
}
