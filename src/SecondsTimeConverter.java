import java.util.Scanner;
// This one just prints because I'm not that good with popup windows yet
public class SecondsTimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int seconds = scanner.nextInt();
        int remainingSeconds = seconds % 60;
        int minutes = (seconds / 60) % 60;
        int hours = seconds / 3600;

        System.out.println("The number of hours passed is: " + hours);
        System.out.println("The number of minutes passed is: " + minutes);
        System.out.println("The number of seconds left is: " + seconds);
    }
}
