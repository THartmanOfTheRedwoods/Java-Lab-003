// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Objects;
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @author Trevor Hartman
     * @author Ander Stanley-Camba
     *
     * @param args Command line arguments [The source file path, The target file path, ...]
     * @since Version 1.0
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("\nMy name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
        domo += scanner.nextLine();

        System.out.println(domo + "\n*Mr. Roboto waves goodbye and walks away*\n\n Would you like to approach him again? (y/n)");


        String choice = scanner.nextLine();
        if (Objects.equals(choice, "n")) {
            System.out.println("\nnow exiting...");
        }
        else {
            main(null);
        }



    }
}
