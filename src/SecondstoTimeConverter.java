import java.util.Scanner;


public class SecondstoTimeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Prompt for input
        System.out.println("Enter number of seconds: ");

        //read int from keyboard
        int totalSeconds = scanner.nextInt();

        //calculate using modulus
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int remainingSeconds = totalSeconds % 60;

        //use printf to format
        System.out.printf("%d seconds = %d hours, %d minutes, %d seconds%n",
                totalSeconds, hours, minutes, remainingSeconds);



    }
}
