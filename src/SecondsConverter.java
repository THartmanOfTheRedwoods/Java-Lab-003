/*
Quinn McKay
1/31/2024
Part 3 of Java Lab 03
 */

import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args){
        int seconds;
        int hours, minutes, remainder_minutes, remainder_seconds;
        final int seconds_per_minute = 60;
        final int minutes_per_hour = 60;
        Scanner time = new Scanner(System.in);

        System.out.print("How many seconds? ");
        seconds = time.nextInt();

        minutes = (seconds / seconds_per_minute);
        hours = (minutes / minutes_per_hour);
        remainder_minutes = (minutes % minutes_per_hour);
        remainder_seconds = (seconds % seconds_per_minute);

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", seconds, hours, remainder_minutes, remainder_seconds);



    }
}
