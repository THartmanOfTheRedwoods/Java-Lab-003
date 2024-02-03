import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        int seconds;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an amount of seconds: ");
        seconds = in.nextInt();
        int convMinutes = seconds/60;
        int convHours = convMinutes/60;
        int convSeconds = seconds - convMinutes*60;
        System.out.println(convHours+" hours, "+ convMinutes%60 +" minutes, and " +convSeconds +" seconds");
    }
}

//Prompt the user for input.
//Read an integer from the keyboard (total number of seconds).
//Calculate the result using the modulus operator.
//Use printf to display the output in the format: "5000 seconds = 1 hours, 23 minutes, and 20 seconds".