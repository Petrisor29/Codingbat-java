package ap1;

/**
 * CodingBat - AP-1: userCompare
 *
 * Compare users first by name (lexicographically),
 * and if names are equal, compare by ID.
 *
 * Return:
 *   -1 if a < b
 *    0 if a == b
 *    1 if a > b
 */
public class UserCompare {

    public int userCompare(String aName, int aId, String bName, int bId) {

        if (aName.equals(bName)) {
            if (aId < bId) return -1;
            if (aId == bId) return 0;
            return 1; // aId > bId
        }

        if (aName.compareTo(bName) < 0) return -1;
        return 1;
    }

    public static void main(String[] args) {
        UserCompare u = new UserCompare();

        System.out.println(u.userCompare("bb", 1, "zz", 2));   // -1
        System.out.println(u.userCompare("bb", 1, "aa", 2));   // 1
        System.out.println(u.userCompare("bb", 5, "bb", 2));   // 1
        System.out.println(u.userCompare("bb", 1, "bb", 1));   // 0
        System.out.println(u.userCompare("aa", 1, "aa", 2));   // -1
    }
}
