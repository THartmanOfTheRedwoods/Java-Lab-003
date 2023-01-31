import java.util.Scanner;

/**
 * @author Trevor Hartman
 *
 * @author Alastiar M
 */
// I will continue to label future assignments as my screen name "crazyne55" but for this assignment I will use my real
// name to prove that I am who I am
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
        double celc = (number-32.0)*(5.0/9.0);
        System.out.println(String.format("%s°F",number));
        System.out.println(String.format("%s°C",celc));
        System.out.println(String.format("%s°C",Math.round(celc)));
        System.out.println(String.format("If it were 2°C warmer it would be: %s°C",(celc+2.0)));
    }
}
