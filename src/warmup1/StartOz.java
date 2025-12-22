package warmup1;

/**
 * CodingBat - Warmup-1: startOz
 *
 * Given a string, return a string made of the first 2 chars (if present),
 * however include first char only if it is 'o' and include the second
 * only if it is 'z', so "ozymandias" yields "oz".
 */
public class StartOz {

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result += "z";
        }
        return result;
    }

    public static void main(String[] args) {
        StartOz so = new StartOz();

        // Cazuri de testare
        System.out.println(so.startOz("ozymandias")); // "oz"
        System.out.println(so.startOz("bzoo"));       // "z"
        System.out.println(so.startOz("oxx"));        // "o"
        System.out.println(so.startOz("oz"));         // "oz"
        System.out.println(so.startOz("o"));          // "o"
        System.out.println(so.startOz("abc"));        // ""
        System.out.println(so.startOz(""));           // ""
    }
}
