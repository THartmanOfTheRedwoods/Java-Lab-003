import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {

        System.out.print("Enter a total number of seconds: ");

        Scanner scanner = new Scanner(System.in);
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", totalSeconds, hours, minutes, seconds);

        scanner.close();
    }
}
