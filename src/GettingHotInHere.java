/**
 * @author Trevor Hartman
 * @author Sequoyah Schaefer
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        float Fahrenheit, Celsius;

            Fahrenheit = number;
        Celsius = ((Fahrenheit-32)*5)/9;
        System.out.println(number + "\u00B0" + "F");
        System.out.printf("%.6f",((Fahrenheit-32)*5)/9);
        System.out.print("\u00B0" + "C");
        System.out.printf("\n" + "%.1f",((Fahrenheit-32)*5)/9);
        System.out.println("\u00B0" + "C" );
        System.out.printf("If it were 2" + "\u00B0" + "C" + " " + "warmer it would be:" + "  " + "%.6f", ((Fahrenheit-32)*5)/9 + 2) ;






    }

}
