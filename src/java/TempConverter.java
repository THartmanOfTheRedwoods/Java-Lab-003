/*
Quinn McKay
1/31/2024
Part 2 of Java Lab 03
 */

import java.util.Scanner;
public class TempConverter {

    public static void main(String[] args) {
        int c;
        double f;
        Scanner celsius = new Scanner(System.in);

        System.out.print("Enter Celsius: ");
        c = celsius.nextInt();
        f = c * 1.8 + 32;

        System.out.printf("%d Celsius = %.1f Fahrenheit.", c, f);


    }
}
