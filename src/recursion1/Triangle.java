package recursion1;

/**
 * CodingBat - Recursion-1: triangle
 *
 * The triangle of blocks with "rows" rows has
 * 1 + 2 + 3 + ... + rows blocks.
 * Compute this recursively.
 */
public class Triangle {

    public int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();

        System.out.println(t.triangle(0));  // 0
        System.out.println(t.triangle(1));  // 1
        System.out.println(t.triangle(2));  // 3
        System.out.println(t.triangle(3));  // 6
        System.out.println(t.triangle(5));  // 15
    }
}
