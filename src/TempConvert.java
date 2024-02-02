import java.util.Scanner;
public class TempConvert {
    public static void main(String[] args) {
        double Celsius;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        Celsius = in.nextDouble();
        System.out.printf("%.1fC = %.1fF", Celsius, (Celsius * 9/5 + 32));
    }
}
