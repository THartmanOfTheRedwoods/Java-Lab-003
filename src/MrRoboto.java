/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy?");

        // Write your program here
        // System.out.println(); // linebreak code

        String savedInput; //Declared variable savedInput as type String

        Scanner userInput = new Scanner(System.in); // Created new Scanner ...
        // variable userInput that takes input from System

        System.out.print(""); // Statement prompts input from user via System

        savedInput = userInput.nextLine(); // Equates Variables userInput(User defined input) ...
        // and savedInput (memory) to each other

        System.out.printf("%s, %s",domo,savedInput); // Outputs saved variables domo and savedInput...
        // from memory with %s (any type) format specifier
    }
}

