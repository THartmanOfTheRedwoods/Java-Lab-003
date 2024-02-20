/**
 * @author James Ward
 *
 * @version 1.0
 */

import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args)
    {
        mainMethod();
    }

    private static void mainMethod() {
        int line;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1 for Temperature conversion tool, 2 for Time conversion tool, 3 to exit program.");
        line = in.nextInt();

        if (line == 1) {
            tempConverter();
            mainMethod();
        } else if (line == 2) {
            timeConverter();
            mainMethod();
        } else if (line == 3) {
            System.out.println("Program ended.");
        } else{
        System.out.println("Invalid Input");
        mainMethod();
        }
    }

    private static void tempConverter() {
        double line;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a temperature in Celsius: ");
        line = in.nextDouble();

        double Fahrenheit = line * 9/5 + 32;

        System.out.printf("%.1f degrees C converts to %.1f degrees F\n",line, Fahrenheit);
    }
    
    private static void timeConverter() {
        int line, hours, minutes, seconds;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a total number of seconds: ");
        line = in.nextInt();

        double hoursDouble = line / 3600.0; // handles the user entering seconds under 3600.
        hours  = (int) hoursDouble;
        minutes = (line % 3600) / 60;
        seconds = line % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.\n", line, hours, minutes, seconds);
        
    }

}