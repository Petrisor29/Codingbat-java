package logic1;

/**
 * CodingBat - Logic-1: dateFashion
 *
 * You and your date are trying to get a table at a restaurant.
 * Success depends on how stylish you and your date are.
 *
 * If either of you has style <= 2 -> 0 (no)
 * If either >= 8 -> 2 (yes)
 * Otherwise -> 1 (maybe)
 */
public class DateFashion {

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    public static void main(String[] args) {
        DateFashion df = new DateFashion();

        System.out.println(df.dateFashion(5, 10)); // 2
        System.out.println(df.dateFashion(5, 2));  // 0
        System.out.println(df.dateFashion(5, 5));  // 1
        System.out.println(df.dateFashion(9, 1));  // 0
        System.out.println(df.dateFashion(3, 9));  // 2
    }
}
