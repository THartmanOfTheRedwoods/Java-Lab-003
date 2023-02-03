import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int fahrenheit = scanner.nextInt();
        double celsius = (fahrenheit - 32) * (5.0 / 9);
        System.out.println(fahrenheit + "°F");
        System.out.println(celsius + "°C");
        System.out.println((int) celsius + "°C");
        System.out.println("If it were 2°C warmer it would be: " + (celsius + 2) + "°C");
    }
}

