/* This program will count the number of words in a message and uses JOptionPane Confirm Dialog box
   and uses a String tokenizer to count the number of words
   10/20/14
   JDK 1.7 
 */

import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class CountWords {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter a message");
        StringTokenizer tokens = new StringTokenizer(input);
        int sum = tokens.countTokens();
        JOptionPane.showConfirmDialog(null, "The message\"" + input
                + "\" has " + sum + " words");
    }

}
