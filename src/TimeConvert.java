import java.util.Scanner;

public class TimeConvert {

    public static void main(String[] args) {

        int seconds;
        final int SECONDS_PER_MINUTE = 60;
        final int SECONDS_PER_HOUR = 3600;

        Scanner time = new Scanner(System.in);

        System.out.println("Enter a number of seconds: ");
        seconds = time.nextInt();

        int hours = seconds / SECONDS_PER_HOUR;
        int minutes = seconds / SECONDS_PER_MINUTE % SECONDS_PER_MINUTE;
        int secondsRemaining = seconds % SECONDS_PER_MINUTE;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds!"
                , seconds, hours, minutes, secondsRemaining);



    }
}
