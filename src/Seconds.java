import java.util.Scanner;
public class Seconds {
    public static void main(String[] args) {
            //Input
            System.out.print("Enter the number of seconds: ");
            //Reads the Input
            Scanner scanner = new Scanner(System.in);
            int Time = scanner.nextInt();
            //Calculates the Input
            int Hours = Time / 3600;
            int Minutes = (Time % 3600) / 60;
            int Seconds = Time % 60;
            //The Output
            System.out.printf("%d Seconds = %d Hours, %d Minutes, and %d Seconds%n",
                    Time, Hours, Minutes, Seconds);
        }
}