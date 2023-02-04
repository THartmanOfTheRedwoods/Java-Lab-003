/**
 *
 * @author Trevor Hartman
 * @author <Rachelle Iloff>
 * Created 02/03/2023
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
        double celsius = (number - 32) * (5.0/9);
        int singleCelsius;


        singleCelsius = (int)celsius;
        System.out.println(number + "°F");
        System.out.println("Let me puzzle that out for you!");
        System.out.println("I'd say about " + singleCelsius + "°C");
        System.out.printf("\nOr %f°C",celsius);
        System.out.println("\nIf it were 2°C warmer it would be: " +(celsius + 2 + "°C"));


       }
}
