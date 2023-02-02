/**
 *
 * @author Trevor Hartman
 * @author Willard Bowles
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
        System.out.println("What is the temperature in °F: ");
        int number = scanner.nextInt();
        float celsius = (number - 32) * (5.0f/9);
        System.out.println(celsius + "°C");
        System.out.println("If it was 2°C Warmer it would be "+ (celsius + 2));
    }
}

