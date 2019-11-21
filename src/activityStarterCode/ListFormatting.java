package activityStarterCode;

import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Assorted List formatting utilities.
 *
 * YOUR TASK: Implement each method and make sure the tests pass.
 *
 */
@SuppressWarnings({"StringConcatenationInLoop", "WeakerAccess"})
public class ListFormatting {
    /**i
     * Returns a new list with each item prefixed with the strings "1. ", "2. ", etc.
     *
     * HINT: Use a for-each loop, and create a variable outside the loop to keep
     *       track of which item number you’re on. (Think: why does the variable
     *       have to be declared and initialized _outside_ the loop? What
     *       happens if you move it inside?)
     */

    public static List<String> numberEachItem(List<String> items) {
        int index = 1;
         List<String> numbered = new ArrayList<>();
        for (String item: items){
            numbered.add(index + ". " + item);
            index++;

        }
        return numbered;
    }

    /**
     * Formats the items in the given list separated by commas and spaces, e.g.
     * "one, two, three".
     *
     * HINT: You can declare a String variable outside the loop, much like you
     *       declared an into outside the loop in the previous example.
     *       Initialize it to an empty string, repeatedly add to it inside the
     *       loop, then return it when you're done.
     */
    public static String formatWithCommas(List<String> items) {
        String listToString = "";
        if (items.size()>1) {
            for (String item : items.subList(0, items.size() - 1)) {

                listToString = listToString + item + ", ";
            }


            return listToString + items.get(items.size()-1);
        }
        else {
            if(items.size() > 0)
                return items.get(0);
            else
                return "";

        }


    }

    /**
     * Formats the given items separated by commas and the word “and” so that
     * they could be used in an English sentence. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two and three"
     *
     *  HINT: There is no way to do this without using several conditionals.
     *        Use the test to help you. After you have it working, see if you
     *        can simplify your solution at all.
     */
    public static String formatGrammatically(List<String> items) {
        String listToString = "";
        if (items.size() == 0)
            return "";
        if(items.size()==1)
            return items.get(0);
        if(items.size()>1){
                for (String item : items.subList(0, items.size() - 2)) {

                    listToString = listToString + item + ", ";
                }
            return listToString + items.get(items.size()-2) + " and " + items.get(items.size()-1);
            }

        return null;
    }

    /**
     * Same as formatGrammatically(), except placing a comma before “and” if
     * there are three or more elements in the list. Examples:
     *
     *    "one"
     *    "one and two"
     *    "one, two, and three"   // Oxford comma after "two"
     *
     *  HINT: It is tricky to get all the cases right! Again, use the test to
     *        help you.
     */
    public static String formatGrammaticallyWithOxfordComma(List<String> items) {
        String listToString = "";
        if (items.size() == 0)
            return "";
        if(items.size()==1)
            return items.get(0);
        if(items.size() == 2)
            return items.get(0) + " and " + items.get(1);
        if(items.size()> 2){
            for (String item : items.subList(0, items.size() - 1)) {

                listToString = listToString + item + ", ";
            }
            return listToString + "and " + items.get(items.size()-1);
        }

        return null;
    }

    /*
     * Special challenge, if you are looking for something extra:
     *
     * Create the following method that can either use the Oxford comma or not,
     * depending on its second parameter:
     *
     *     public static String formatGrammatically(List<String> items, boolean oxfordComma) {
     *         ???
     *     }
     *
     * Don't implement it by using the two methods above. Instead, do it the
     * other way around. Change the methods above so they both use your new one,
     * like this:
     *
     *     public static String formatGrammatically(List<String> items) {
     *         formatGrammatically(items, false);
     *     }
     *
     *     public static String formatGrammaticallyWithOxfordComma(List<String> items) {
     *         formatGrammatically(items, true);
     *     }
     *
     * ...and see if all the tests still pass!
     */
}
