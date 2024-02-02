import java.util.Scanner;

public class SecondsConvert {

    public static void main(String[] args) {
        int hours, minutes, seconds;
        final int CONVERSION = 60;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your amount of seconds: ");
        seconds = in.nextInt();

        minutes = seconds / CONVERSION;
        hours = minutes / CONVERSION;
        minutes = minutes % CONVERSION;
        seconds = seconds % CONVERSION;
        System.out.printf("%d hours %d minutes %d seconds", hours, minutes, seconds);
    }
}
