import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n", totalSeconds, hours, minutes, seconds);

        scanner.close();
    }
}

