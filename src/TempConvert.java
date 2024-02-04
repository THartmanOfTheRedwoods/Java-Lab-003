import java.util.Scanner;
public class TempConvert {
    public static void main (String[] args) {

        System.out.print("Enter temperature in Celsius:");
        double celsius;
        double fahrenheit;
        Scanner scan = new Scanner(System.in);
        celsius = scan.nextDouble();

        fahrenheit = celsius * 9 / 5 + 32;

        //System.out.printf("Temperature in Fahrenheit: %.1f", + fahrenheit);
        System.out.printf(" %.1f C in Fahrenheit is %.1f F", celsius, fahrenheit);

    }
}
