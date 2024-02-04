import java.util.Scanner;
public class TemperatureConvert {

    public static void main(String[] args) {
        double F;
        double C;
        Scanner in = new Scanner(System.in);
        System.out.print("Input temperature in Celsius:  ");
        C = in.nextDouble();
        System.out.println("Your input " + C + "C");
        F = (C * 9 / 5) + 32;
        System.out.println(C + "C" + " = " + F + "F");
        System.out.println(F + "F" + " = " + C + "C");
        in.close();

        /* Just for my own practice, I'm putting the code down in reverse.
        double F;
        double C;
        Scanner in = new Scanner(System.in);
        System.out.print("Input temperature in Fahrenheit:  ");
        F = in.nextDouble();
        System.out.println("You input " + F + "F");
        C = (F - 32) * 5/9;
        System.out.println(C + "C" + " = " + F + "F");
        System.out.println(F + "F" + " = " + C + "C");
        in.close();
        */

    }
}

