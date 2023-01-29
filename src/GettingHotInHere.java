/**
 *
 * @author Trevor Hartman
 * @author Jeff Grimm
 *
 * @since Version 1.0
 */
import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.


        int savedInput; // Declares variable savedInput as integer
        double c,cM; // Declare variables f (fahrenheit) and c (celsius) as floating-point numbers
        Scanner userInput = new Scanner(System.in); // Declares new Scanner variable as "userInput"

        System.out.print("What is the temperature in °F: "); // Prompts user enter input for variable

        savedInput = userInput.nextInt(); // Equates variable savedInput as storage for userInput variable
        double f = (double)savedInput; // Casts savedInput (int) as variable f (double)

        // System.out.println(f); // used for testing input

        c = ((f-32)*5/9); // converts  variable f to c

        int intC = (int)c; // Casts c (double) as intC (int)

        cM = c + 2; // Calculation for final line out

        // System.out.println(intC); // Tests c (double) conversion to intC (int)

        System.out.printf(savedInput + "°F"); // Prints original user input
        System.out.println(); // Linebreak
        System.out.printf("%f°C", c); // Prints fahrenheit converted to celsius
        System.out.println(); // Linebreak
        System.out.print(intC + "°C"); // Prints variable c (double) converted to integer (intC)
        System.out.println(); // Linebreak
        System.out.print("If it were 2°C warmer it would be:" + cM + "°C"); // outputs cM = c+2

    }
}
