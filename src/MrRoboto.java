// Import the Scanner tool used for reading (All external packages/libraries/apis are imported similarly this)
/**
 *
 * @Author Clay Cordary
 *
 * @Version 1.0
 */

import java.util.Objects;
import java.util.Scanner;

public class MrRoboto {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);

        // Concatenate the user response to this String.
        String domo = "Domo arigato ";

        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        // Write your program here
        String name = scanner.nextLine();
        System.out.println(domo + name);
        System.out.println("To practice this I will ask, what is your favorite food? ");
        String favFood = scanner.nextLine();
        if (Objects.equals(favFood, "Sushi")) {
            System.out.println("oh I love sushi too.");
        }
        else {
            System.out.println("Personally I like sushi but I guess some people like, " + favFood);
        }
    }
}
