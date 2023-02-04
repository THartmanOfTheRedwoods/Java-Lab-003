/**
 *
 * @author Trevor Hartman
 * @author <Rachelle Iloff>
 * Created 02/03/2023
 * @since Version 1.0
 *
 */
// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        String line;
        Scanner scanner = new Scanner(System.in);

        scanner.nextLine();
        String domo = "Domo arigato ";


        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        line = scanner.nextLine();// Write your program here
        System.out.println(domo + line);

        System.out.println("What's the meaning of life?");
        line = scanner.nextLine();
        System.out.println(line + " very wise indeed...");
    }
}

