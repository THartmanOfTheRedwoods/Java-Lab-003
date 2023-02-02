/**
 * @author Trevor Hartman
 * @author Mike Quist
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
        System.out.println(number +"°F");
        System.out.println((number-32.0) * (5.0/9.0) + "°C");
        double number2 = ((number-32.0) * (5.0/9.0));
        System.out.print((int) number2 + "°C");
    }
}
