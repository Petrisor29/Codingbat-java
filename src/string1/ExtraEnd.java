package string1;

/**
 * CodingBat - String-1: extraEnd
 *
 * Given a string, return a new string made of 3 copies
 * of its last 2 characters.
 */
public class ExtraEnd {

    public String extraEnd(String str) {
        String result = str.substring(str.length() - 2, str.length());
        return result + result + result;
    }

    public static void main(String[] args) {
        ExtraEnd ee = new ExtraEnd();

        System.out.println(ee.extraEnd("Hello"));  // "lololo"
        System.out.println(ee.extraEnd("ab"));     // "ababab"
        System.out.println(ee.extraEnd("Hi"));     // "HiHiHi"
    }
}
