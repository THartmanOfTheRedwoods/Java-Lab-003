import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args){

        double f, c;
        Scanner in = new Scanner(System.in);

        System.out.print("What is the temp in degrees Celsius? ");
        c = in.nextDouble();
        f = c * 9.0/5.0 + 32.0;
        System.out.printf("The temp in degrees Fahrenheit is %.1f", f);
    }
}
