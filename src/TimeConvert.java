import java.util.Scanner;
public class TimeConvert {
    public static void main (String[] args) {

        System.out.print("Enter number of seconds:");
        int totalSec;
        Scanner scan = new Scanner(System.in);
        totalSec = scan.nextInt();

        int hours = totalSec / 3600;
        int remainSec = totalSec % 3600;
        int minutes = remainSec / 60;
        int seconds = remainSec % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds", totalSec, hours, minutes, seconds);

    }
}
