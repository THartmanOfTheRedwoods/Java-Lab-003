import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        System.out.printf("What is the temperature in Celsius?\n");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = ((celsius * 9/5) + 32);
        System.out.printf("%.1f degrees Celsius is equal to %.1f degrees Fahrenheit\n", celsius, fahrenheit);

    }
}
