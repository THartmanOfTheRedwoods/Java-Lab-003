import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        int hour, minute, second, seconds;
        final int minPerHr = 60 * 60; // 3600
        Scanner in = new Scanner(System.in);
        System.out.print("Input number of seconds:  ");
        seconds = in.nextInt();
        second = seconds % 60 % 60;
        minute = (seconds % minPerHr) / 60;
        hour = seconds / 60 / 60;
        System.out.print(hour + " hours ");
        System.out.print(minute + " minutes ");
        System.out.println(second + " seconds.");
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.", seconds, hour, minute, second);
        in.close();
    }
}