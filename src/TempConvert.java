import java.util.Scanner;
class TempConvert {
    public static void main(String[] args) {
        //Input
        System.out.print("Enter temperature: ");

        //Takes the Input and reads it as a double output
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();

        //Calucates the result
        double fahrenheit = celsius * 9 / 5 + 32;

        //Prints the output
        System.out.printf("%.1f Celsius is equal to %.1f Fahrenheit%n", celsius, fahrenheit);

    }
}