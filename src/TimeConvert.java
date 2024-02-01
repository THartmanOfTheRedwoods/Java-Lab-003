import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("# of seconds: ");
        int total = scanner.nextInt();

        int hours = total / 3600;
        int minutes = (total % 3600) / 60;
        int seconds = total % 60;

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.\n", total, hours, minutes, seconds);
    }
}
