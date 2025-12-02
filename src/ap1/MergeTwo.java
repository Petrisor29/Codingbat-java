package ap1;

/**
 * CodingBat - AP-1: mergeTwo
 *
 * Given two sorted arrays a and b, return a new array of length n
 * containing the first n elements from the combined sorted arrays,
 * without duplicates.
 */
public class MergeTwo {

    public String[] mergeTwo(String[] a, String[] b, int n) {

        String[] result = new String[n];
        int i = 0, j = 0, k = 0;

        while (k < n) {

            if (a[i].compareTo(b[j]) < 0) {
                result[k] = a[i];
                i++;
            }
            else if (a[i].compareTo(b[j]) > 0) {
                result[k] = b[j];
                j++;
            }
            else { 
                // equal: take only one, advance both
                result[k] = a[i];
                i++;
                j++;
            }

            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        MergeTwo m = new MergeTwo();

        print(m.mergeTwo(
                new String[]{"a", "c", "z"},
                new String[]{"b", "f", "z"},
                3)); // ["a","b","c"]

        print(m.mergeTwo(
                new String[]{"a", "c", "z"},
                new String[]{"a", "c", "z"},
                3)); // ["a","c","z"]

        print(m.mergeTwo(
                new String[]{"f", "g", "z"},
                new String[]{"c", "f", "g"},
                3)); // ["c","f","g"]
    }

    private static void print(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\"" + arr[i] + "\"");
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
