import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a total number of seconds ");
        final int SECONDS_PER_MINUTE=60;
        final int MINUTES_PER_HOUR=60;
        int totalSeconds, secondsE,hours, minutes, seconds;
        totalSeconds=in.nextInt();
        System.out.println("Enter a total amount of seconds: " + totalSeconds);
        secondsE=totalSeconds%(MINUTES_PER_HOUR*SECONDS_PER_MINUTE);
        hours= totalSeconds/(MINUTES_PER_HOUR*SECONDS_PER_MINUTE);
        minutes=secondsE/SECONDS_PER_MINUTE;
        seconds=totalSeconds-(hours*SECONDS_PER_MINUTE*MINUTES_PER_HOUR)-(minutes*SECONDS_PER_MINUTE);
        System.out.printf("%d seconds = %d hours %d minutes %d seconds", totalSeconds, hours, minutes,seconds );
    }
}