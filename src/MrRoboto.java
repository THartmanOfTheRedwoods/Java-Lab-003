// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...
     *
     * HENRY STEM-FAULK
     *
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy?");
        // Write your program here

        String name;
        name = scanner.nextLine();

        System.out.println("My name is Mr. Roboto, are you Kilroy? " + name);
        System.out.println(domo + name);


    }
}
