import java.util.Scanner;
public class SecondsToTimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a total number of seconds: ");
        int totalSeconds = scanner.nextInt();
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n", totalSeconds, hours, minutes, seconds);
        scanner.close();
    }
}
