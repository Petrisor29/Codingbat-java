package string3;

/**
 * CodingBat - String-3: withoutString
 *
 * Return a version of the base string where all instances of the remove
 * string have been removed (case-insensitive), but preserving the
 * original characters of the base string.
 */
public class WithoutString {

    public String withoutString(String base, String remove) {
        String result = "";
        String lowerBase = base.toLowerCase();
        String lowerRemove = remove.toLowerCase();

        for (int i = 0; i < base.length(); ) {
            if (i <= base.length() - remove.length() &&
                lowerBase.substring(i, i + lowerRemove.length()).equals(lowerRemove)) {
                
                i += lowerRemove.length();
            } else {
                result += base.charAt(i);
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        WithoutString ws = new WithoutString();

        System.out.println(ws.withoutString("Hello there", "llo"));       // "He there"
        System.out.println(ws.withoutString("Hello there", "e"));         // "Hllo thr"
        System.out.println(ws.withoutString("Hello there", "x"));         // "Hello there"
        System.out.println(ws.withoutString("Banana", "na"));             // "Ba"
        System.out.println(ws.withoutString("THIS is a TEST", "is"));     // "TH  a TEST"
    }
}
