/**
 * @author Trevor Hartman
 * @author Alexei Iachkov
 * @version 1
 * @date 1-3-24
 */
//import scanner
import java.util.Scanner;
public class TimeConvert {
    public static void main(String[] args) {

        //prompt user for input
        System.out.println("Enter a total number of seconds:");

        //read input
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();

        //conversions
        int totaltime = in.nextInt();
        int hours = totaltime / (60*60);
        int minutes = totaltime % (60*60) / 60;
        int seconds = totaltime % 60;

        //print converted result
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds", totaltime, hours, minutes, seconds);


    }
}
