import java.util.Scanner;

public class Format {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.currentTimeMillis();
        System.out.print("Enter a temperature in Celsius: ");
        String input = s.nextLine();
        double i = Double.parseDouble(input);
        Double input1= (i*9/5)+32;
        System.out.printf("Drgree Celsius : %.1f%% C ", i);
        System.out.printf("and Drgree Fahrenheit : %.1f%% F%n", input1);

        Scanner s1 = new Scanner(System.in);
        System.currentTimeMillis();
        System.out.print("Enter a total number of seconds: ");
        String input2 = s1.nextLine();
        int second = Integer.parseInt(input2);
        int secondtohour= second/3600;
        int secondtomin = secondtohour*60;
        int secondtosecond=secondtomin*60;
        System.out.printf("5000 second = %d hours, %d minutes, and %d seconds",secondtohour,secondtomin,secondtosecond);




    }
}
