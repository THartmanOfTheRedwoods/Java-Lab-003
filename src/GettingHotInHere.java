import java.util.Objects;
import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @author Trevor Hartman
     * @author Ander Stanley-Camba
     * @param args Command line arguments [The source file path, The target file path, ...]
     *
     * @since Version 1.0
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhat is the temperature in °F: ");
        try {
            float number = Float.parseFloat(scanner.nextInt() + ".0");
            float Cfl = (float) ((number - 32.0) * (5.0 / 9.0));
            int C = (int) Cfl;
            float Cfl2 = (float) (((number + 2.0) - 32.0) * (5.0 / 9.0));
            ;

            System.out.println(((int) number) + "°F\n" + Cfl + "°C" + "\n" + C + "°C\n" + "If it were 2°C warmer it would be: " + Cfl2);
            System.out.println("Would you like to try again? (n/y)\n");
            scanner.nextLine();
            String choice = scanner.nextLine();
            if (Objects.equals(choice, "Y") || Objects.equals(choice, "y")) {
                main(null);
            } else {
                System.out.println("now exiting...");
            }
        }
        catch (Exception e) {

            System.out.println("\nError: please input a number only");
            main(null);
        }
    }

}
