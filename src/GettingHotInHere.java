/**
 *
 * @author Trevor Hartman
 * @author Geng Cha
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

        System.out.println(number +"°F");

        float hankGreene = ( (float) (number - 32) ) * (5.0f/9.0f);
        System.out.printf("%f" +"°C%n", hankGreene);

        System.out.println( (int) hankGreene+"°C");

        float winterIsNotComing = hankGreene + 2.0f;
        System.out.printf("If it were 2°C warmer be: %f°C%n", winterIsNotComing);
    }
}
