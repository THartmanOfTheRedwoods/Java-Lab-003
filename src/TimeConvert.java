import java.util.Scanner;
public class TimeConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a total number of seconds:");
        int totSecs = in.nextInt();
int hours = totSecs / 3600;
int secsRemain = totSecs % 3600;
        int minutes = secsRemain / 60;
        int seconds = secsRemain % 60;
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds%n", totSecs, hours, minutes, seconds);

    }
}
