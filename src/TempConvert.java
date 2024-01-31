import java.util.Scanner;
/**
 *
 * @author Trevor Hartman
 * @author Eliot Rodriguez
 *
 * @since version 1.0
 * January 30, 2024
 *
 */
public class TempConvert {
static double c;
static double f;
static int secs;
static final int secsInMin = 60;
static final int minsInHour = 60;
static int hours, minutes, seconds;
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a temperature in Celsius: ");
        c = scanner.nextDouble();
        f = c * 9.0/5.0 + 32.0;
        System.out.printf("%.1f C = %.1f F", c, f);
        System.out.print("\nEnter a total number of seconds: ");
        secs = scanner.nextInt();
        hours = (secs/secsInMin)/minsInHour;
        minutes = (secs/secsInMin)-minsInHour;
        seconds = secs%secsInMin;
        System.out.printf("%d secs = %d hours, %2d minutes, %2d seconds",secs, hours, minutes, seconds);
    }
}
