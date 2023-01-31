/**
 *
 * @Author Clay Cordary
 * @Version 1.0
 *
 */

import java.sql.SQLOutput;
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
        double number = scanner.nextDouble();
        System.out.println((int) number + "°F");
        final double divBy = 5.0 / 9.0;
        double C = (number - 32);
        int celsiusOutput = (int) (C * divBy);
        int celsiusOutputAdd2 = celsiusOutput + 2;
        System.out.println("The temperature is "+ celsiusOutput + "°C");
        System.out.println("If it were 2 degrees warmer it would be " + celsiusOutputAdd2 + "°C" );
    }
}
