import java.util.Scanner;

public class TempConvert {

    public static void main(String[] args) {

        int celsius;

        Scanner wthr = new Scanner(System.in);

        System.out.println("What is the weather in Nezahualcóyotl, Mexico right now?");
        celsius = wthr.nextInt();

        double fahrenheit = celsius * 9/5 + 32;
        // I put "9/5" in parentheses and that completely changed the answer.
        System.out.printf("In Fahrenheit that's: %.1f\n", fahrenheit);
        System.out.printf("\n%d C = %.1f F\n", celsius, fahrenheit);

    }

}
