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
        double y = number;
        double x = (y - 32.0)*(5.0/9.0); // Converts to Celsius //
        double warmer = (x+2.00); // Used to describe warmer later in code //
        System.out.println(number+"F"); // Prints initial temp //
        System.out.println(x+"C"); // Prints temp in Celsius as a floating point //
        int CelInt = (int) x; // Converts temp in Celsius to integer //
        System.out.println(CelInt); // Prints Celsius temperature as integer //
        System.out.println("If it were 2C warmer, it would be " + warmer + "C"); // Prints Celsius if it were 2 degrees warmer //
    }
}
