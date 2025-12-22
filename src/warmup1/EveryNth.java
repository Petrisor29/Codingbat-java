package warmup1;

/**
 * CodingBat - Warmup-1: everyNth
 *
 * Given a non-empty string and an int N, return the string made starting 
 * with char 0, and then every Nth char of the string. So if N is 3, 
 * use char 0, 3, 6, ... and so on. N is 1 or more.
 */
public class EveryNth {

    public String everyNth(String str, int n) {
        String result = "";
        
        // Parcurgem șirul din n în n pași
        for (int i = 0; i < str.length(); i = i + n) {
            result += str.charAt(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        EveryNth en = new EveryNth();

        // Cazuri de testare
        System.out.println(en.everyNth("Miracle", 2));      // "Mrcl"
        System.out.println(en.everyNth("abcdefg", 2));      // "aceg"
        System.out.println(en.everyNth("abcdefg", 3));      // "adg"
        System.out.println(en.everyNth("Chocolate", 3));    // "Cca"
        System.out.println(en.everyNth("Chocolates", 100)); // "C"
    }
}
