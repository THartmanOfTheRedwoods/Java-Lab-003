/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @version 1
 * @date 1-3-24
 */
//import scanner
import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {

        //prompt user for input
        System.out.print("Enter a temperature in celsius:");

        //read input
        Scanner in = new Scanner(System.in);

        //convert celsius to fahrenheit
        double celsius = in.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;

        //print converted result
        System.out.printf("%.1f C = %.1f F", celsius, fahrenheit);

    }
}
