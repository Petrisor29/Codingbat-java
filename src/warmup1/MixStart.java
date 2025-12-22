package warmup1;

/**
 * CodingBat - Warmup-1: mixStart
 *
 * Return true if the given string begins with "mix",
 * except the 'm' can be anything, so "pix", "9ix" all count.
 */
public class MixStart {

    public boolean mixStart(String str) {
        if (str.length() < 3) return false;
        String ix = str.substring(1, 3);
        return ix.equals("ix");
    }

    public static void main(String[] args) {
        MixStart ms = new MixStart();

        // Cazuri de testare
        System.out.println(ms.mixStart("mix snacks")); // true
        System.out.println(ms.mixStart("pix snacks")); // true
        System.out.println(ms.mixStart("piz snacks")); // false
        System.out.println(ms.mixStart("nix"));        // true
        System.out.println(ms.mixStart("ni"));         // false
        System.out.println(ms.mixStart("mix"));        // true
    }
}
