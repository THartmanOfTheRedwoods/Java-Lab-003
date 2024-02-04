import java.util.Scanner;

public class TimeConverter{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Enter a total number of seconds: ");

        //Read an integer from keyboard
        int totalSeconds = in.nextInt();

        //Calculate results
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        //Display output of calculations
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", totalSeconds, hours, minutes, seconds);
    }
}