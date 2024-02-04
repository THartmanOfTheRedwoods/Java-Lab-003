import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double numberInCelcius;
        double numberInFahrenheit;

        //Prompt user for number in Celsius and store value
        System.out.print("Enter a number in Celsius: ");
        numberInCelcius = in.nextDouble();

        //Convert number to Fahrenheit and print result
        numberInFahrenheit = numberInCelcius * 9/5 + 32;
        System.out.printf("%.1f C = %.1f F", numberInCelcius, numberInFahrenheit);
    }
}