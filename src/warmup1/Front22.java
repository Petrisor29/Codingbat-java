package warmup1;

/**
 * CodingBat - Warmup-1: front22
 *
 * Given a string, take the first 2 chars and return the string
 * with the 2 chars added at both the front and the back.
 * If the string length is less than 2, use whatever is there.
 */
public class Front22 {

    public String front22(String str) {
        if (str.length() < 2) return str + str + str;

        String first = str.substring(0, 2);
        return first + str + first;
    }

    public static void main(String[] args) {
        Front22 f = new Front22();

        System.out.println(f.front22("kitten")); // "kikittenki"
        System.out.println(f.front22("Ha"));     // "HaHaHa"
        System.out.println(f.front22("H"));      // "HHH"
    }
}
