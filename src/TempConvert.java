import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        System.out.println("Please Enter The Temperature in Celsius: ");
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;

        System.out.println(celsius + " C = " + (fahrenheit) + " F");
        scanner.close();

    }
}
//creating scanner and object to read inputs
//prompt for user to input
//read what user typed
//calculate the temp from C to F
//close scanner