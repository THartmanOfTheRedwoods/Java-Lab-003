/**
 *
 * @author Trevor Hartman
 * @author Aaron Johnson
 *
 * @since Version 1.0
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
        int X = scanner.nextInt();
        double Y = (X - 32.0)*(5.0 / 9.0);
        String degree = "°C";

        System.out.println(X + "°F");
        System.out.printf("%.6f", Y);
        System.out.println(degree);
        System.out.printf("%.0f", Y);
        System.out.println(degree);
        System.out.print("If it were 2°C warmer it would be: ");
        System.out.printf("%.6f", (Y + 2.0));
        System.out.println(degree);

        // Fun with floating point formatting!
    }
}
