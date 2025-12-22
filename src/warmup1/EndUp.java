package warmup1;

/**
 * CodingBat - Warmup-1: endUp
 *
 * Given a string, return a new string where the last 3 chars are now 
 * in upper case. If the string has less than 3 chars, uppercase 
 * whatever is there. Note that str.toUpperCase() returns the uppercase 
 * version of a string.
 */
public class EndUp {

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        
        int cutPoint = str.length() - 3;
        String first = str.substring(0, cutPoint);
        String end = str.substring(cutPoint);
        
        return first + end.toUpperCase();
    }

    public static void main(String[] args) {
        EndUp eu = new EndUp();

        // Cazuri de testare
        System.out.println(eu.endUp("Hello"));     // "HeLLO"
        System.out.println(eu.endUp("hi there"));  // "hi thERE"
        System.out.println(eu.endUp("hi"));        // "HI"
        System.out.println(eu.endUp("woo hoo"));   // "woo HOO"
        System.out.println(eu.endUp("xyz12"));     // "xyZ12"
        System.out.println(eu.endUp(""));          // ""
    }
}
