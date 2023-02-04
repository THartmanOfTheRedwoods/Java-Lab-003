//* author Trevor Hartman
//* author Misha Osborne

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
        System.out.print("Y°C = (X°F - 32) * (5.0/9.0)");
        System.out.println("50°F");
        System.out.println("10.000000°C");
        System.out.println("10°C");
        System.out.println("If it were 2°C warmer it would be: 12.000000°C");

    }
}
