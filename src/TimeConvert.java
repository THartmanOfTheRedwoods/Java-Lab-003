import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        int seconds;
        final int minutesInHour = 60 * 60;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of seconds:  ");
        seconds = in.nextInt();
        second = seconds % 60 % 60;
        minute = (seconds % minutesInHour) / 60;
        hour = seconds / 60 / 60;
        System.out.print(hour + " hours ");
        System.out.print(minute + " minutes ");
        System.out.println(second + " seconds.");
        in.close();
    }
}
