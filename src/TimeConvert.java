import java.util.Scanner;
public class TimeConvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    System.out.println("Please Enter Total Number of Seconds: ");

        int seconds;
    seconds = in.nextInt();

    int convertMinutes = seconds/60;
    int convertHours = convertMinutes/60;
    int convertSeconds = seconds - convertMinutes*60;

    System.out.println(convertHours+ " Hours, "+ convertMinutes%60 +" Minutes, and " +convertSeconds +" Seconds");
    }
}
//Asking for user input
//reading the input
//calculate the result
//print result