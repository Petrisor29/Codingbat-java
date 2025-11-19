package string2;

/**
 * CodingBat - String-2: countCode
 *
 * Return the number of times "co?e" appears in the string,
 * where ? can be any character.
 */
public class CountCode {

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountCode cc = new CountCode();

        System.out.println(cc.countCode("aaacodebbb"));      // 1
        System.out.println(cc.countCode("codexxcode"));      // 2
        System.out.println(cc.countCode("cozexxcope"));      // 2
        System.out.println(cc.countCode("coAeBcodeXcoYe"));  // 3
        System.out.println(cc.countCode("coXe"));            // 1
        System.out.println(cc.countCode("abc"));             // 0
    }
}
