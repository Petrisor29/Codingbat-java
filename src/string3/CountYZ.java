package string3;

/**
 * CodingBat - String-3: countYZ
 *
 * Return the number of words ending in 'y' or 'z',
 * ignoring case. A word ends when the next character
 * is not a letter.
 */
public class CountYZ {

    public int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length() - 1; i++) {
            if ((str.charAt(i) == 'y' || str.charAt(i) == 'z')
                    && !Character.isLetter(str.charAt(i + 1))) {
                count++;
            }
        }

        char last = str.charAt(str.length() - 1);
        if (last == 'y' || last == 'z') {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        CountYZ cy = new CountYZ();

        System.out.println(cy.countYZ("fez day"));        // 2
        System.out.println(cy.countYZ("day fez"));        // 2
        System.out.println(cy.countYZ("day fyyyz"));      // 2
        System.out.println(cy.countYZ("DAY yz!"));        // 2
        System.out.println(cy.countYZ("y2bz"));           // 2 (y and z at end)
        System.out.println(cy.countYZ("hello"));          // 0
    }
}
