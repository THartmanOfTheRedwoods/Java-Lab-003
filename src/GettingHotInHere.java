/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class GettingHotInHere {
    public static double f2c(double f){
        double c = (f - 32) * (5.0/9);
        return c;
    }
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();

        System.out.printf("%d°F%n", number);
        System.out.printf("%f°C%n",f2c(number));
        System.out.printf("%d°C%n",(int)f2c(number));
        //If it were 2°C warmer it would be: 12.000000°C
        System.out.printf("If it were 2°C warmer it would be: %f°C%n",2+f2c(number));






    }
}
