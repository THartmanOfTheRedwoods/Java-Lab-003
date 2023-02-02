/**
 *
 * @author Trevor Hartman
 * @author Willard Bowles
 *
 * @since Version 1.0
 *
 */


import java.util.Scanner;

public class MrRoboto {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("My name is Mr. Roboto, are you Kilroy? ");
        String domo = "Domo arigato ";
        String name = input.nextLine();
        System.out.print(domo + name);

    }
}
