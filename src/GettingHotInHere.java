/**
 *
 * @author Trevor Hartman
 * @author Linh Dinh
 *
 * @since Version 1.0
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
        final double FREEZING_POINT = 32.0; //declare final variable
        final double CONSTANT = 5.0/9.0; //declare final variable
        Scanner scanner = new Scanner(System.in); //read input from user
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt(); //read an integer from user
        double celsius = (number - FREEZING_POINT)*(CONSTANT);
        int celsiusInt = (int)celsius; // convert the value of Celsius to integer
        System.out.println(number + "°F");
        System.out.printf("%f°C%n",celsius);
        System.out.println(celsiusInt + "°C");
        System.out.printf("If it were 2°C warmer it would be: %f°C",(2.0+celsius));

    }
}
