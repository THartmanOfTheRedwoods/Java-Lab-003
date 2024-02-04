/**
 * @author Jenny Li
 * @ Version 1.0
 * 2/3/24
 */

public class TempConvert {
    public static void main(String[] args) {
        int y;
        y = 12;
        double pi = 12;
        System.out.printf("%d seconds  %f seconds",y,pi);
    }
}

/**
 import java.util.Scanner;
public class TempConvert {
    public static void main (String args[]) {
    double fahrenheit, celsius;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a temperature in Celsius: ");
    celsius = in.nextDouble();
    fahrenheit = ((celsius * (9/5)) + 32);
    System.out.println(celsius = fahrenheit);

    }
}
**/

/**
import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a total number of seconds: ");
        int seconds = input.nextInt();

        int hour= seconds/3600;
        int second = seconds%60;
        seconds=seconds%3600;
        int min=seconds/60;

        System.out.printf( seconds + "seconds = " + "%d hours, %d minutes, %d seconds", hour,min,second);
    }
}
**/