import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Colton Simpson
 *
 * @since Version 1.0
 *
 */
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
           int F = 50;
          int C = ((F * 5) - (32 * 5)) / 9;
            System.out.println(C);
        }
}
