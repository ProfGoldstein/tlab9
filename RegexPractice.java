import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * Lab 9 testbed for regex practice.
 * 
 * @author Jim Teresco
 * @version Spring 2023
 */

public class RegexPractice {

    public static void main(String[] args) {

        // this string is the regular expression we are looking for
        String regex = "\\d\\d";
        // this string is the text in which we are searching
        String text = "2-digit numbers 32 8378 b5 hey!";

        // note that we don't construct a Pattern object directly, but instead
        // call the static method compile that constructs it for us
        Pattern p = Pattern.compile(regex);

        // the matcher method of Pattern constructs and returns a Matcher object
        // which, among other things, allows us to iterate over matching
        // substrings
        Matcher m = p.matcher(text);

        // Matcher's find method finds the next matching substring in the text
        // that matches the regular expression, returning true on success
        while (m.find()) {

            // Matcher's group method returns the substring of the most recent match
            System.out.println(m.group());
        }
    }
}
