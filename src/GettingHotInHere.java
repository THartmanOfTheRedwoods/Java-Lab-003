/**
 * Author: Owen van Mantgem
 *
 *Version: 1.5
 *
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

        double number_Celsius = ((double)number - 32.0) * (5.0/9.0);

        System.out.println(number + "°F");
        System.out.println(number_Celsius+ "°C");
        System.out.println((int)number_Celsius + "°C");
        number_Celsius = number_Celsius+ 2;
        System.out.println("If it were 2°C warmer it would be: "+ number_Celsius+ "°C");
    }
}
