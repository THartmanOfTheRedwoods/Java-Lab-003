import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {

        int sec, seconds, minutes, hours;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        sec = in.nextInt();

        // Convert 'sec' to hours, minutes, seconds:
        hours = sec / SEC_PER_HOUR;
        minutes = (sec % SEC_PER_HOUR) / SEC_PER_MIN;
        seconds = sec % 60;

        System.out.printf("%d seconds = %d hour(s), %d minute(s), %d second(s).", sec, hours, minutes, seconds);

    }
}
