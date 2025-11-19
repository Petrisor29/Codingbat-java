package string2;

/**
 * CodingBat - String-2: catDog
 *
 * Return true if the number of "cat" and "dog" appearances are the same.
 */
public class CatDog {

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) countCat++;
            if (str.substring(i, i + 3).equals("dog")) countDog++;
        }

        return countCat == countDog;
    }

    public static void main(String[] args) {
        CatDog cd = new CatDog();

        System.out.println(cd.catDog("catdog"));          // true
        System.out.println(cd.catDog("catcat"));          // false
        System.out.println(cd.catDog("1cat1cadodog"));    // true
        System.out.println(cd.catDog("dogdogcat"));       // false
        System.out.println(cd.catDog("ca"));              // true (0 == 0)
    }
}
