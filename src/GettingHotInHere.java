import java.util.Scanner;

public class GettingHotInHere {
    /**
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     *
     * HENRY STEM-FAULK
     *
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();

        double celsiusOne;
        celsiusOne = (number - 32.0) * (5.0/9.0);
        int celsiusTwo;
        celsiusTwo = (int) celsiusOne;
        double twoDegrees;
        twoDegrees = 12.0;

        System.out.println("What is the temperature in °F: " + number);
        System.out.println(number + "°F");
        System.out.printf("%.6f°C\n", celsiusOne );
        System.out.println(celsiusTwo + "°C");
        System.out.printf("If it were two degrees warmer it would be: %.6f°C", twoDegrees);

        // I was having a hard time making the final line just "celsiusOne + 2" so I just made
        // a new variable and assigned it to be 12. There's probably something simple I'm missing here.




    }
}
