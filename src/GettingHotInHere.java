/**
 *
 * @author Trevor Hartman
 * @author Katie Logefeil
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
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();
        System.out.println(number + "°F");
        float celcius = ((number - 32) * 5/9);
        System.out.printf("%.6f",celcius);
        System.out.println("°C");
        float cel = celcius +2;
        String result = String.format("%.6f", cel);
        int c = ((number - 32) * 5/9);
        System.out.println(c + "°C");
        System.out.println("If it were 2° warmer it would be: " + result + "°C");

    }
}
