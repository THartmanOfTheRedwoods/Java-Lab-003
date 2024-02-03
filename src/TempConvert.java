import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        double conversion;
        Scanner in = new Scanner(System.in);
        System.out.print("Type a temperature in Celsius and I will calculate it into Fahrenheit: ");
        conversion = in.nextInt();
        System.out.printf(conversion + " Celsius is "+"%.1f Fahrenheit", (conversion*1.8+32));
    }
}
//Prompt the user for input.
//Read a double value from the keyboard.
//Calculate the result using the formula: F = C × 9/5 + 32.
//Format the output to one decimal place.
//Test the program by entering a temperature in Celsius.
