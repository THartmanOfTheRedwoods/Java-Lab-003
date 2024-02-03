import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

    System.out.printf("Enter the total time in seconds:\n");
    Scanner scanner = new Scanner(System.in);
    int totalseconds = scanner.nextInt();
        int hours = totalseconds/3600;
        int minutes = (totalseconds % 3600)/60;
        int seconds = totalseconds % 60;
    System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", totalseconds, hours, minutes, seconds);
    scanner.close();
    }
}
