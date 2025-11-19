package string1;

/**
 * CodingBat - String-1: makeTags
 *
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
 * Given tag and word strings, create the HTML string with tags around the word.
 */
public class MakeTags {

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public static void main(String[] args) {
        MakeTags mt = new MakeTags();

        System.out.println(mt.makeTags("i", "Yay"));      // <i>Yay</i>
        System.out.println(mt.makeTags("cite", "Hello")); // <cite>Hello</cite>
        System.out.println(mt.makeTags("b", "Bold"));     // <b>Bold</b>
        System.out.println(mt.makeTags("strong", "Hi"));  // <strong>Hi</strong>
    }
}
