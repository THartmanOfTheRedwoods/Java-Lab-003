import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //prompt for input
        System.out.println("Enter Celsius: ");

        //read double from keyboard
        double celsius = scanner.nextDouble();

        //calculate
        double fahrenheit = celsius * 9 / 5 + 32;

        //format to one decimal
        System.out.printf("%.1f Celsius = %.1f Fahrenheit%n", celsius, fahrenheit);

    }
}
